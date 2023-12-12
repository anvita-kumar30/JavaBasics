package test;

import weka.clusterers.HierarchicalClusterer;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class HierarchicalClustering {
    public static void main(String[] args) {
        try {
            // Load your dataset
            DataSource source = new DataSource("your_dataset.arff");
            Instances data = source.getDataSet();

            // Create a HierarchicalClusterer
            HierarchicalClusterer clusterer = new HierarchicalClusterer();

            // Set the options for the clusterer (e.g., linkage method)
            String[] options = {"-L", "SINGLE"}; // Single-linkage clustering
            clusterer.setOptions(options);

            // Build the clusterer on the data
            clusterer.buildClusterer(data);

            // Get the cluster assignments for each instance
            String[] assignments = clusterer.getOptions();

            // Print the cluster assignments
            for (int i = 0; i < assignments.length; i++) {
                System.out.println("Instance " + i + " is in Cluster " + assignments[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
