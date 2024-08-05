package testa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryManipulation {

    // Function to compute the minimum number of operations
    public static long minOperations(long n) {
        // Convert n to binary string representation
        String bin = Long.toBinaryString(n);

        // Initialize operations counter
        int operations = 0;

        // To count trailing zeroes, we will track if we are in a sequence of zeros
        boolean inZeroSequence = false;

        // Iterate over each bit in binary representation from left to right
        for (int i = 0; i < bin.length(); i++) {
            char currentBit = bin.charAt(i);

            // Rule 2: Change rightmost digit without restriction
            if (currentBit == '1') {
                operations++; // Change this 1 to 0
                if (inZeroSequence) {
                    // If there was a sequence of `0`s before, count them all as well
                    operations += bin.length() + i - 1; // All trailing zeros
                    inZeroSequence = false;
                }
            } else {
                // We are in a sequence of `0`s
                if (!inZeroSequence) {
                    inZeroSequence = true;
                }
            }
        }

        // If we ended with a sequence of zeros
        if (inZeroSequence) {
            operations += bin.length(); // Account for the last sequence of `0`s
        }

        return operations;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine().trim());
        System.out.println(minOperations(n));
    }
}