package p1;

import java.util.Arrays;
import java.util.Scanner;
public class main{
    public static boolean isAlphabet(char c) {
        if ((c <= 'z' && c >='a') || (c <= 'Z' && c >='A')) return true;
        return false;
    }
    public static boolean isNumber(char c) {
        if (c <= '9' && c >= '0') return true;
        else return false;
    }
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input");
        String userName = myObj.nextLine();
        String str = userName;
        String[] keywords = {"int", "float", "const", "return"};
        Character[] operators = {'+', '-', '*', '/', '='};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') continue;
            else if (isAlphabet(c)) {
                StringBuilder strBuild = new StringBuilder();
                while(i < str.length() && (isAlphabet(str.charAt(i)))) {
                    strBuild.append(str.charAt(i));
                    i++;
                }
                if (Arrays.asList(keywords).contains(strBuild.toString())) System.out.println(strBuild+" is a keyword");
                else System.out.println(strBuild+" is a variable");

                if (str.charAt(i) == ';') System.out.println(str.charAt(i)+ " is a separator");
            }
            else if (isNumber(c)) {
                StringBuilder strBuild = new StringBuilder();
                while(i < str.length() && (isNumber(str.charAt(i)))) {
                    strBuild.append(str.charAt(i));
                    i++;
                }
                System.out.println(strBuild+" is a constant");
                if (str.charAt(i) == ';') System.out.println(str.charAt(i)+ " is a separator");
            }
            else if (Arrays.asList(operators).contains(c)) {
                System.out.println(str.charAt(i)+ " is a operator");
            }
        }
    }
}