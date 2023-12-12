package test;

import java.io.*;
import java.lang.*;

public class Kmeans {
    public static void main(String args[]) {
        int N = 10;
        int arr[] = {2, 4, 10, 12, 3, 20, 30, 11, 25, 31}; // initial data
        int i, m1, m2, a, b, n = 0;
        boolean flag = true;
        float sum1, sum2;
        a = arr[0];
        b = arr[1];
        m1 = a;
        m2 = b;

        int cluster1[] = new int[N];
        int cluster2[] = new int[N];

        do {
            n++;
            int k = 0, j = 0;
            sum1 = 0;
            sum2 = 0;

            // Clear clusters in each iteration
            for (i = 0; i < N; i++) {
                cluster1[i] = 0;
                cluster2[i] = 0;
            }

            for (i = 0; i < N; i++) {
                if (Math.abs(arr[i] - m1) <= Math.abs(arr[i] - m2)) {
                    cluster1[k] = arr[i];
                    k++;
                } else {
                    cluster2[j] = arr[i];
                    j++;
                }
            }

            for (i = 0; i < k; i++)
                sum1 += cluster1[i];
            for (i = 0; i < j; i++)
                sum2 += cluster2[i];

            a = m1;
            b = m2;

            // Cast to float to avoid integer division
            m1 = (int) Math.round(sum1 / k);
            m2 = (int) Math.round(sum2 / j);

            if (m1 == a && m2 == b)
                flag = false;
            else
                flag = true;

            System.out.println("After iteration " + n + " , cluster 1 :\n"); // printing the clusters of each iteration
            for (i = 0; i < k; i++)
                System.out.print(cluster1[i] + "\t");

            System.out.println("\n");
            System.out.println("After iteration " + n + " , cluster 2 :\n");
            for (i = 0; i < j; i++)
                System.out.print(cluster2[i] + "\t");
            System.out.println("\n");

        } while (flag);

        System.out.println("Final cluster 1 :\n"); // final clusters
        for (i = 0; i < N; i++) {
            if (cluster1[i] != 0) {
                System.out.println(cluster1[i] + "\t");
            }
        }

        System.out.println();
        System.out.println("Final cluster 2 :\n");
        for (i = 0; i < N; i++) {
            if (cluster2[i] != 0) {
                System.out.println(cluster2[i] + "\t");
            }
        }
    }
}
