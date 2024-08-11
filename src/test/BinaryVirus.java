package test;

import java.util.Scanner;

public class BinaryVirus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements
        int N = scanner.nextInt();

        // Read the array of numbers
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scanner.nextInt();
        }

        // Read the number of spikes in the virus
        int n = scanner.nextInt();

        // Process each number
        for (int i = 0; i < N; i++) {
            // Convert to binary string
            String binaryString = Integer.toBinaryString(V[i]);

            // Remove the last 'n' bits if possible
            if (binaryString.length() > n) {
                binaryString = binaryString.substring(0, binaryString.length() - n);
            } else {
                binaryString = "0";
            }

            // Convert back to integer and print
            System.out.print(Integer.parseInt(binaryString, 2) + " ");
        }
    }
}
