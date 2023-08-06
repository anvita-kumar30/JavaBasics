package test;

import java.util.*;
class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int r, sum=0;
        int temp=n;
        if(temp<0)
        {
            System.out.println("Not palindrome");
            return false;
        }
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome number ");
            return true;
        }
        else{
            System.out.println("Not palindrome");
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        PalindromeNumber me=new PalindromeNumber();
        me.isPalindrome(a);
    }
}