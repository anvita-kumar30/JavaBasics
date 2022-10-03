package test;

import java.util.*;
class student5
{
    int marks1,marks2,marks3,total;
    String name;
    void getdata(String n, int marks1, int marks2, int marks3)
    {
        this.name=n;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    int getTotal()
    {
        return total=marks1+marks2+marks3;
    }
}
class smain
{
    public static void main(String args[])
    {
        int index=0;
        student5 s[]=new student5[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter the name, marks1, marks2 and marks3: ");
            String n=sc.next();
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            s[i]=new student5();
            s[i].getdata(n,m1,m2,m3);
            s[i].getTotal();
        }
        int max=s[0].getTotal();
        System.out.println("\nName\tMarks1\tMarks2\tMarks3\tTotal");
        for(int i=0;i<5;i++)
        {
            System.out.println(s[i].name+"\t"+s[i].marks1+"\t"+s[i].marks2+"\t"+s[i].marks3+"\t"+s[i].total);
            if(s[i].getTotal()>max)
            {
                max=s[i].getTotal();
                index=i;
            }
        }
        System.out.println("\nDetails of the student having the highest marks are: ");
        System.out.println("Name\tMarks1\tMarks2\tMarks3\tTotal");
        System.out.println(s[index].name+"\t"+s[index].marks1+"\t"+s[index].marks2+"\t"+s[index].marks3+"\t"+s[index].getTotal());
    }
}