package test;

import java.util.*;
public class Twob
{
    public static void main(String[] args)
    {
        int sum=0,count=0;
        for(int i=100; i<200; i++)
        {
            if(i%7==0)
            {
                sum=sum+i;
                count++;
            }
        }
        System.out.println("Sum of numbers between 100 to 200 that are divisible by 7= "+sum);
        System.out.println("Count of numbers between 100 to 200 that are divisible by 7= "+count);
    }
}