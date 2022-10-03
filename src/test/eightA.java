package test;

import java.lang.*;
import java.io.*;

class eightA {
    public static void main(String args[]) throws IOException
    {
        String word;
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string to check: ");
        word = br.readLine();
        int len;
        len = word.length();
        for(i=0; i<=len/2; i++){
            if(word.charAt(i)!=word.charAt(len-i-1))
            {
                break;
            }
        }
        if(i==len/2+1){
            System.out.println(word+" is a palindrome");
        }
        else{
            System.out.println(word+" not a palindrmoe");
        }
    }
}