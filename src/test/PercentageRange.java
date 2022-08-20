package test;


import java.util.Scanner;

public class PercentageRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Grade: ");
        char g=sc.next().charAt(0);
        System.out.println("Grade: "+g);
        if(g=='F')
            System.out.println("Percentage Range is 0-60\n");
        else if(g=='D')
            System.out.println("Percentage Range is 61-70\n");
        else if(g=='C')
            System.out.println("Percentage Range is 71-80\n");
        else if(g=='B')
            System.out.println("Percentage Range is 81-90\n");
        else if(g=='A')
            System.out.println("Percentage Range is 91-100\n");
        else
            System.out.println("Enter a Valid Grade");
    }
}
