package test;

import java.util.Scanner;

public class Threeb {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter number 1: ");
                int num1=sc.nextInt();
                System.out.print("Enter number 2: ");
                int num2=sc.nextInt();
                System.out.print("Enter number 3: ");
                int num3=sc.nextInt();
                //For maximum
                if (num1 >= num2 && num1 >= num3)
                    System.out.println( num1 + " is the maximum number.");
                else if (num2 >= num1 && num2 >= num3)
                    System.out.println( num2 + " is the maximum number.");
                else
                    System.out.println( num3 + " is the maximum number.");
                //For minimum
                if (num1 <= num2 && num1 <= num3)
                    System.out.println( num1 + " is the minimum number.");
                else if (num2 <= num1 && num2 <= num3)
                    System.out.println( num2 + " is the minimum number.");
                else
                    System.out.println( num3 + " is the minimum number.");
    }
}
