//package testa;
//import java.util.Scanner;
//
//public class TakingInput {
//        public static void main(String[] args) {
//            System.out.println("Taking input from the user");
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int a=sc.nextInt();import java.util.*;
//class Main {
//    public static String swapString(String s, int i, int j) {
//        char[] b = s.toCharArray();
//        char temp;
//        temp = b[i];
//        b[i] = b[j];
//        b[j] = temp;
//        return String.valueOf(b);
//    }
//
//    public static void generatePermutation(String s, int start, int end, HashSet < String > set) {
//
//        if (start == end - 1)
//            set.add(s + " ");
//        else {
//            for (int i = start; i < end; i++) {
//                s = swapString(s, start, i);
//                generatePermutation(s, start + 1, end, set);
//                s = swapString(s, start, i);
//            }
//        }
//
//    }
//    public static int maxDiff(String str, String s) {
//        int c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == str.charAt(i));
//            else
//                c++;
//        }
//        return c;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String[] a = new String[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.next();
//        }
//        for (int i = 0; i < n; i++) {
//            HashSet < String > set = new HashSet < String > ();
//            String s = a[i];
//            generatePermutation(s, 0, s.length(), set);
//            int max = 0;
//            int k = 0;
//            for (String str: set) {
//
//                k = maxDiff(str, s);
//                max = Math.max(max, k);
//
//            }
//            System.out.println(max);
//        }
//    }
//
//}
//        float a=sc.nextFloat();
//        System.out.print("Enter number 2: ");
//        int b=sc.nextInt();
//        float b=sc.nextFloat();
//        int sum=a+b;
//        float sum=a+b;
//        System.out.print("The sum of these numbers is: ");
//        System.out.print(sum);
//        boolean b1=sc.hasNextInt();
//        System.out.println(b1);
//        String str=sc.next();      //prints only the word until there is a space encountered
//        String str=sc.nextLine();  //prints the whole statement
//        System.out.println(str);
//    }
//}
