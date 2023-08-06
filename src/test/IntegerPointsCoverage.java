package test;
import java.util.Scanner;
public class IntegerPointsCoverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of segments
        System.out.print("Enter the number of segments: ");
        int numSegments = scanner.nextInt();

        int[][] A = new int[numSegments][2];

        // Input: Segments
        for (int i = 0; i < numSegments; i++) {
            System.out.print("Enter the start and end points of segment " + (i + 1) + ": ");
            A[i][0] = scanner.nextInt();
            A[i][1] = scanner.nextInt();
        }

        // Calculate integer points coverage
        int[] B = calculateIntegerPointsCoverage(A);

        // Print result
        System.out.println("Number of integer points covered by exactly i segments:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }

    public static int[] calculateIntegerPointsCoverage(int[][] A) {
        int maxEndPoint = 0;
        for (int[] segment : A) {
            maxEndPoint = Math.max(maxEndPoint, segment[1]);
        }

        int[] count = new int[maxEndPoint + 1];

        for (int[] segment : A) {
            count[segment[0]]++;
            count[segment[1] + 1]--;
        }

        int[] result = new int[A.length + 1];
        int currentCount = 0;

        for (int i = 1; i <= maxEndPoint; i++) {
            currentCount += count[i];
            if (currentCount <= A.length) {
                result[currentCount]++;
            }
        }

        return result;
    }
}
