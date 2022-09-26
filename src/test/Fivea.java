package test;

//WAP to count number of even and odd elements from an array

import java.util.*;

class Fivea{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n;
        int count_even=0;
        int count_odd=0;
        System.out.println("Enter the number of elements in an array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\n");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("\nThe array is:");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("\nNumber of even elements in the array: " + count_even);
        System.out.println("\nNumber of odd elements in the array: " + count_odd);
    }
}