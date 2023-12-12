package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HierarClus {
    public static void main(String[] args) {
        // Sample data
        double[][] data = {
                {2.0, 3.0},
                {2.5, 3.5},
                {3.0, 4.0},
                {5.0, 7.0},
                {5.5, 7.5},
                {6.0, 8.0}
        };

        // Creating a distance matrix
        double[][] distanceMatrix = calculateDistanceMatrix(data);

        // Print the initial distance matrix
        System.out.println("Initial Distance Matrix:");
        printMatrix(distanceMatrix);

        // Performing hierarchical clustering
        int iteration = 1;
        while (distanceMatrix.length > 1) {
            // Find the closest clusters
            int[] closestClusters = findClosestClusters(distanceMatrix);

            // Merging the closest clusters
            distanceMatrix = mergeClusters(distanceMatrix, closestClusters);

            // Print the distance matrix at each iteration
            System.out.println("Distance Matrix After Iteration " + iteration + ":");
            printMatrix(distanceMatrix);
            iteration++;
        }
    }

    // Calculating the distance matrix
    private static double[][] calculateDistanceMatrix(double[][] data) {
        int n = data.length;
        double[][] distanceMatrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = euclideanDistance(data[i], data[j]);
                distanceMatrix[i][j] = distance;
                distanceMatrix[j][i] = distance; // Symmetric matrix
            }
        }

        return distanceMatrix;
    }

    // Calculating Euclidean distance between two points
    private static double euclideanDistance(double[] point1, double[] point2) {
        double sum = 0.0;
        for (int i = 0; i < point1.length; i++) {
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

    // Find the closest clusters in the distance matrix
    private static int[] findClosestClusters(double[][] distanceMatrix) {
        int n = distanceMatrix.length;
        double minDistance = Double.MAX_VALUE;
        int cluster1 = 0;
        int cluster2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (distanceMatrix[i][j] < minDistance) {
                    minDistance = distanceMatrix[i][j];
                    cluster1 = i;
                    cluster2 = j;
                }
            }
        }

        return new int[]{cluster1, cluster2};
    }

    // Merge the closest clusters
    private static double[][] mergeClusters(double[][] distanceMatrix, int[] closestClusters) {
        int n = distanceMatrix.length;
        int cluster1 = closestClusters[0];
        int cluster2 = closestClusters[1];

        // Create a list of clusters excluding cluster1 and cluster2
        List<double[]> newClusters = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i != cluster1 && i != cluster2) {
                newClusters.add(distanceMatrix[i]);
            }
        }

        // Calculate the distance to the new cluster from other clusters
        double[] mergedCluster = new double[newClusters.size()];
        for (int i = 0; i < newClusters.size(); i++) {
            double dist1 = newClusters.get(i)[cluster1];
            double dist2 = newClusters.get(i)[cluster2];
            double distMerge = (dist1 + dist2) / 2.0;
            mergedCluster[i] = distMerge;
        }

        // Add the merged cluster to the list
        newClusters.add(mergedCluster);

        // Create a new distance matrix with reduced dimensions
        double[][] newDistanceMatrix = new double[newClusters.size()][newClusters.size()];
        for (int i = 0; i < newClusters.size(); i++) {
            for (int j = i + 1; j < newClusters.size(); j++) {
                newDistanceMatrix[i][j] = newClusters.get(i)[j];
                newDistanceMatrix[j][i] = newClusters.get(i)[j]; // Symmetric matrix
            }
        }

        return newDistanceMatrix;
    }

    // Helper method to print a matrix
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
