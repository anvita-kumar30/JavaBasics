package test;

import java.util.*;
class employee {
    int h,wage,id;
    String name;
    void getdata(String n,int id,int h) {
        this.name=n;
        this.id=id;
        this.h=h;
    }
    int getWage() {
        return wage=h*100;
    }
}
class main {
    public static void main(String args[]) {
        int index=0;
        employee temp=new employee();
        employee e[]=new employee[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter the id, name and hours: ");
            int id=sc.nextInt();
            String n=sc.next();
            int h=sc.nextInt();
            e[i]=new employee();
            e[i].getdata(n,id,h);
        }
        int max=e[0].getWage();
        System.out.println("\nId\tName\tHours\tWages");
        for(int i=0;i<5;i++) {
            System.out.println(e[i].id+"\t"+e[i].name+"\t"+e[i].h+"\t"+e[i].getWage());
            if(e[i].getWage()>max) {
                max=e[i].getWage();
                index=i;
            }
        }
        System.out.println("\nDetails of the employee having the highest wage are: ");
        System.out.println("Id\tName\tHours\tWages");
        System.out.println(e[index].id+"\t"+e[index].name+"\t"+e[index].h+"\t"+e[index].getWage());
    }
}
