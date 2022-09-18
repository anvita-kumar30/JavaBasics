package test;

import java.util.*;

class Max
{
    int num1,num2,num3,max;
    void ternary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1=sc.nextInt();
        System.out.println("Enter a number: ");
        num2=sc.nextInt();
        System.out.println("Enter a number: ");
        num3=sc.nextInt();
        max=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println("Maximum of the three numbers is "+max);
    }
}
class Fourb
{
    public static void main(String[] args){
        Max m=new Max();
        m.ternary();
    }
}