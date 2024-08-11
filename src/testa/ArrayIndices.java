package testa;

import java.util.*;

public class ArrayIndices {
    public static void processedArray(int n, int[] array, int m, int[] indicesDrop) {
        // Use a TreeSet to efficiently manage the indices to be removed
        Set<Integer> indicesToRemove = new TreeSet<>();
        for (int index : indicesDrop) {
            indicesToRemove.add(index);
        }

        // Create a new list to store the remaining elements
        List<Integer> resultList = new ArrayList<>();

        // Iterate through the array and add elements that are not to be removed
        for (int i = 0; i < n; i++) {
            if (!indicesToRemove.contains(i)) {
                resultList.add(array[i]);
            }
        }

        // Print the result list elements
        for (int num : resultList) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line after the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        int n = sc.nextInt();
        int[] array = new int[n];

        // Read elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Read size of the indices array
        int m = sc.nextInt();
        int[] indicesDrop = new int[m];

        // Read indices to be removed
        for (int i = 0; i < m; i++) {
            indicesDrop[i] = sc.nextInt();
        }

        // Process the array to remove elements at specified indices
        processedArray(n, array, m, indicesDrop);

        // Close the scanner
        sc.close();
    }
}