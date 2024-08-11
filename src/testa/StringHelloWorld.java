package testa;

import java.util.Scanner;

public class StringHelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // str is the given input string.
        scanner.close();

        // Iterate through the string and print each substring of length 3
        for (int i = 0; i <= str.length() - 3; i++) {
            System.out.println(str.substring(i, i + 3));
        }

        // Print any remaining characters if the length is not a multiple of 3
        if (str.length() % 3 != 0) {
            System.out.println(str.substring(str.length() - str.length() % 3));
        }
    }
}