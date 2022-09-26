package test;

//WAP to count total marks and highest marks obtained by a student

import java.util.*;

class fiveB{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        int total=0,max=0;
        System.out.println("Enter the number of subjects: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\nEnter marks out of 100:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            total=total+a[i];
        }
        System.out.println("\nTotal marks obtained: "+total);
        /*for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }*/
        max=a[0];
        for(i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Highest marks obtained: "+max);
    }
}