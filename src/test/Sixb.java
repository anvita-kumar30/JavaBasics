package test;

import java.util.Scanner;
class Sixb {
    public static void main(String args[]) {
        int i, j;
        int sum=0;
        System.out.println("Enter the number of rows and columns:");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int array[][] = new int[row][column];
        if (row == column)
        {
            System.out.println("The matrix is a Square Matrix");
        }
        else
        {
            System.out.println("Enter the matrix elements:");
            for(i = 0; i < row; i++) {
                for(j = 0; j < column; j++)
                {
                    array[i][j] = s.nextInt();
                    System.out.print("");
                }
            }
            System.out.println("The Matrix is: ");
            for(i = 0; i < row; i++) {
                for(j = 0; j < column; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println(" ");
            }
            for(i = 0; i < row; i++) {
                for(j = 0; j < column; j++) {
                    if(i==j)
                        sum = sum + array[i][j];
                }
            }
            System.out.println("The sum of diagonal elements is "+ sum);
        }
    }
}
