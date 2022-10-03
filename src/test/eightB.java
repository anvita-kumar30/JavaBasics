package test;

import java.util.Scanner;
class eightB
{
    public static void main(String args[]) {
        String str;
        int upper=0, lower=0, special=0, blankSpace=0, num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        str=sc.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z') //check uppercase
                upper++;
            else if(ch>='a' && ch<='z') //check lower case
                lower++;
            else if(ch>='0' && ch<='9')  //check numeric
                num++;
            else if(ch == ' ')
                blankSpace++;
            else
                special++;
        }
        System.out.println("Uppercase letters: "+upper);
        System.out.println("Lowercase letters: "+lower);
        System.out.println("Special characters: "+special);
        System.out.println("Blank Spaces: "+blankSpace);
        System.out.println("Digits: "+num);
    }
}