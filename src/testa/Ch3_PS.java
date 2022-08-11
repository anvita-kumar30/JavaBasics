package testa;

public class Ch3_PS {
    public static void main(String[] args) {
        // Problem 1 convert a string to lowercase
        String name = "Anvita Kumar";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2  replace spaces with underscores
        String text = "Hello my     friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3  fill in a letter template
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sidhan");
        System.out.println(letter);

        // Problem 4  to detect double and triple spaces in a string
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5  format the following letter using escape sequence characters
        String myLetter = "Dear Sir,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
