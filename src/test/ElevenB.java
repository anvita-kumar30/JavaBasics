package test;

import java.util.*;
class payException extends Exception{
    public payException(String str){
        super(str);
    }
}
public class ElevenB{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic pay: ");
        int n = sc.nextInt();
        try{
            if(n<25000 || n>50000)
                throw new payException("\u001B[41mPay out of bounds\u001B[0m");
            else
                System.out.println("Clear");
        }
        catch(payException e){
            System.out.println(e);
        }

    }
}