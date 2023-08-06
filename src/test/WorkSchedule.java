//there are A number of days in a year and you have to perform some type of work in a year. there are M types of work to be performed and you are given a 2D array B of size M which represents description for the different types of work. B[i][0] means the day on which the ith work is givn. B[i][1] mean the ith work must be completed before this day. B[i][2] denotes the number of days it will take to complete ith work. now on any day one of these three things can be done- 1) rest day 2) this is the deadline date for any work (i.e. B[i][1]) (nothing can be done on this day) 3) you are performing any one work. if in case you cannot perform all work before the deadline return a vector of size 1 which is [ -1] else return a vector of size A+1, whose first element is -1 and the - ith element is 0 if it is a rest day. - ith element is M+1 if this day is a deadline for any type of work. - if any type of work is performed on this day then the ith element will be the type of that work. (types are starting from 1 to M). Also note on any day there will be a deadline for at most 1 type of work. if more than one type of work can be performed on any day then perform the one having a deadline first.

package test;

import java.util.*;

public class WorkSchedule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of days in a year and number of types of work
        int A = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] B = new int[M][3];

        // Input: Work descriptions
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the work schedule
        List<Integer> schedule = calculateWorkSchedule(A, M, B);
        for (int day : schedule) {
            System.out.print(day + " ");
        }
    }

    public static List<Integer> calculateWorkSchedule(int A, int M, int[][] B) {
        // Create a list of work deadlines and sort them
        List<Work> deadlines = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            deadlines.add(new Work(i + 1, B[i][1]));
        }
        Collections.sort(deadlines);

        // Initialize schedule
        int[] schedule = new int[A + 1];
        Arrays.fill(schedule, -1);

        // Assign work deadlines
        for (Work work : deadlines) {
            if (work.day > A || schedule[work.day] != -1) {
                return Arrays.asList(-1);
            }
            schedule[work.day] = M + 1;
        }

        // Assign work days
        for (int i = 0; i < M; i++) {
            int startDay = B[i][0];
            int daysNeeded = B[i][2];
            for (int j = startDay; j <= A && daysNeeded > 0; j++) {
                if (schedule[j] == -1 || schedule[j] == M + 1) {
                    schedule[j] = i + 1;
                    daysNeeded--;
                }
            }
            if (daysNeeded > 0) {
                return Arrays.asList(-1);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(-1);
        for (int i = 1; i <= A; i++) {
            result.add(schedule[i]);
        }
        return result;
    }

    static class Work implements Comparable<Work> {
        int type;
        int day;

        public Work(int type, int day) {
            this.type = type;
            this.day = day;
        }

        @Override
        public int compareTo(Work other) {
            return Integer.compare(this.day, other.day);
        }
    }
}
