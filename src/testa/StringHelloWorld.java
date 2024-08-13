package testa;

import java.util.Scanner;

public class StringHelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // str is the given input string.
        scanner.close();

        int length = str.length();
        // Iterate through the string and print each substring of length 3
        for (int i = 0; i <= length - 3; i+=3) {
            int end = Math.min(i + 3, length);
            System.out.println(str.substring(i, end));
        }

        // Print any remaining characters if the total length is not a multiple of 3.
        int remainderStart = (length / 3) * 3;
        if (remainderStart < length) {
            System.out.println(str.substring(remainderStart));
        }
    }
}