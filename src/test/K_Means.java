package test;

import java.util.*;

public class K_Means {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Dataset input
        System.out.println("Enter the size of data points:");
        int N = sc.nextInt();
        int DataPoints[] = new int[N];
        System.out.println("Enter the Data points:");
        for (int i = 0; i < N; i++) {
            DataPoints[i] = sc.nextInt();
        }

        System.out.println("Enter Total number of clusters:");
        int ClusterNumber = sc.nextInt();
        if (ClusterNumber >= N) {
            System.out.println("Not a valid cluster number.");
        } else {
            int Means[] = new int[ClusterNumber];
            int ClusterAssignments[] = new int[N];

            Random rand = new Random();
            for (int i = 0; i < ClusterNumber; i++) {
                Means[i] = DataPoints[rand.nextInt(N)];
            }

            int maxIterations = 100;
            for (int iteration = 0; iteration < maxIterations; iteration++) {

                for (int i = 0; i < N; i++) {
                    int minDist = Integer.MAX_VALUE;
                    int closestCluster = -1;
                    for (int j = 0; j < ClusterNumber; j++) {
                        int dist = Math.abs(DataPoints[i] - Means[j]);
                        if (dist < minDist) {
                            minDist = dist;
                            closestCluster = j;
                        }
                    }
                    ClusterAssignments[i] = closestCluster;
                }

                for (int j = 0; j < ClusterNumber; j++) {
                    int sum = 0;
                    int count = 0;
                    for (int i = 0; i < N; i++) {
                        if (ClusterAssignments[i] == j) {
                            sum += DataPoints[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        Means[j] = sum / count;
                    }
                }
            }

            for (int cluster = 0; cluster < ClusterNumber; cluster++) {
                System.out.print("Cluster " + cluster + ": ");
                for (int i = 0; i < N; i++) {
                    if (ClusterAssignments[i] == cluster) {
                        System.out.print(DataPoints[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}