//you are given an integer A and an integer array B which is the permutation of A integers. now you have to perform some swap operations on this permutation B. now after this swap operation B should be such that it can be made to identify permutation by exactly C  swaps(which is minimum required). you have to return a 2D array D which denotes the minimum swaps you have to perform so that B will become identity after exactly C swaps . D[i][0] and D[i][1] denotes the index of swap operation you are performing. return this lexicographically smallest array D. if you don't need to perform any swap operation then return D=[[-1,-1]]. also note identity permutation is a permutation where B[i]=i, for each 1<=i<=A.

package test;

import java.util.*;

public class MinimumSwapsForPermutation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of array and identity swaps
        int A = scanner.nextInt();
        int[] B = new int[A];
        for (int i = 0; i < A; i++) {
            B[i] = scanner.nextInt();
        }
        int C = scanner.nextInt();

        int[][] D = minSwapsForPermutation(A, B, C);

        // Output: Resultant swaps
        for (int[] swap : D) {
            System.out.println(swap[0] + " " + swap[1]);
        }
    }

    public static int[][] minSwapsForPermutation(int A, int[] B, int C) {
        int[][] D = new int[C][2];

        if (C == 0) {
            return new int[][]{{-1, -1}};
        }

        // Create a list of pairs to store values and their original indices
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            pairs.add(new Pair(B[i], i));
        }

        // Sort the pairs to find the minimum swaps
        Collections.sort(pairs);

        for (int i = 0; i < C; i++) {
            if (i < A) {
                int x = pairs.get(i).index;
                int y = i;
                D[i] = new int[]{x, y};
            } else {
                // In case we need extra swaps to achieve C swaps
                D[i] = new int[]{0, 0};
            }
        }

        return D;
    }

    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.value, other.value);
        }
    }
}
