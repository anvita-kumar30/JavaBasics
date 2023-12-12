package test;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class NaiveBayes {
    private static final String SPAM_LABEL = "spam";
    private static final String NOT_SPAM_LABEL = "not spam";

    private final Map<String, Double> spamProbabilities;
    private final Map<String, Double> notSpamProbabilities;

    public NaiveBayes() {
        spamProbabilities = new HashMap<>();
        notSpamProbabilities = new HashMap<>();
    }

    public void train(String csvFilePath) {
        try {
            Reader reader = new FileReader(csvFilePath);  // Use the provided file path
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

            for (CSVRecord record : csvParser) {
                String label = record.get(record.size() - 1); // Assumes the last column is the class label

                // Update class-specific word probabilities
                for (int i = 0; i < record.size() - 1; i++) {
                    String word = record.get(i);

                    if (label.equals(SPAM_LABEL)) {
                        spamProbabilities.put(word, spamProbabilities.getOrDefault(word, 0.0) + 1.0);
                    } else if (label.equals(NOT_SPAM_LABEL)) {
                        notSpamProbabilities.put(word, notSpamProbabilities.getOrDefault(word, 0.0) + 1.0);
                    }
                }
            }

            csvParser.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String classify(String emailContent) {
        String[] words = emailContent.split(" ");
        double spamScore = 1.0;
        double notSpamScore = 1.0;

        for (String word : words) {
            double spamProbability = spamProbabilities.getOrDefault(word, 0.0);
            double notSpamProbability = notSpamProbabilities.getOrDefault(word, 0.0);

            // Avoid zero probabilities with Laplace smoothing
            spamScore *= (spamProbability + 1) / (spamProbabilities.size() + 2); // Add 1 for Laplace smoothing
            notSpamScore *= (notSpamProbability + 1) / (notSpamProbabilities.size() + 2); // Add 1 for Laplace smoothing
        }

        // Compare the scores and classify
        if (spamScore > notSpamScore) {
            return SPAM_LABEL;
        } else {
            return NOT_SPAM_LABEL;
        }
    }

    public static void main(String[] args) {
        NaiveBayes classifier = new NaiveBayes();

        // Train the classifier using a CSV dataset file
        classifier.train("email_dataset.csv"); // Replace with the path to your CSV file

        // Classify an example email
        String emailContent = "Get a free iPhone now!";
        String result = classifier.classify(emailContent);

        System.out.println("Predicted class for the email: " + result);
    }
}
