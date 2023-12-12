//given an array A of N integers and an array B of Q queries and updates. There are three types of queries which are as follows: 1) 1 l r v : Initialize every elementwith v in the range [l,r]. 2) 2 l r v : Change every element x in the range [l,r] to x OR v. 3) 2 l r 0 : Find the sum of bitwise AND of all the subarrays [l1,r1] such that l1>=1 and r1<=r. you have to return the answer for each query of type 3 in the order in which they are asked

package test;

import java.util.*;

public class ArrayQueriesAndUpdates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in array and number of queries
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] A = new int[N];

        // Input: Array elements
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        List<int[]> queries = new ArrayList<>();

        // Input: Queries
        for (int i = 0; i < Q; i++) {
            int type = scanner.nextInt();
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            int v = scanner.nextInt();
            queries.add(new int[]{type, l, r, v});
        }

        // Process queries and updates
        int[] result = processQueriesAndUpdates(A, queries);

        // Output: Results of type 3 queries
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] processQueriesAndUpdates(int[] A, List<int[]> queries) {
        int[] result = new int[queries.size()];
        int idx = 0;

        for (int[] query : queries) {
            int type = query[0];
            int l = query[1];
            int r = query[2];
            int v = query[3];

            if (type == 1) {
                // Type 1: Initialize range [l,r] with v
                for (int i = l; i <= r; i++) {
                    A[i] = v;
                }
            } else if (type == 2) {
                // Type 2: Change range [l,r] to x OR v
                for (int i = l; i <= r; i++) {
                    A[i] |= v;
                }
            } else if (type == 3) {
                // Type 3: Find sum of bitwise AND of subarrays [l1,r1]
                int sum = 0;
                for (int l1 = l; l1 <= r; l1++) {
                    for (int r1 = l1; r1 <= r; r1++) {
                        int andResult = A[l1];
                        for (int k = l1 + 1; k <= r1; k++) {
                            andResult &= A[k];
                        }
                        sum += andResult;
                    }
                }
                result[idx++] = sum;
            }
        }

        return result;
    }
}
