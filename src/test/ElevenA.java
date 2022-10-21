package test;

import java.util.Scanner;

class numException extends Exception{
    public numException(String str){
        super(str);
    }
}
public class ElevenA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try{
            if(n!=5 && n!=6 && n!=7)
                throw new numException("Invalid number");
            else
                System.out.println("Clear");
        }
        catch(numException e){
            System.out.println(e);
        }
    }
}