package test;

import java.util.Scanner;
class Foura
{
    String ename, department;
    int eID;
    float salary;
    void getEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        ename=sc.nextLine();
        System.out.println("Enter Employee ID: ");
        eID=sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        salary=sc.nextFloat();
        System.out.println("Enter Employee Department: ");
        department=sc.next();
    }
    void putEmployee(){
        System.out.println("\n****Employee Details****\n\nEmployee Name: " +ename+ "\nEmployee ID: "  +eID+ "\nEmployee Salary: " +salary+ "\nEmployee Department: " +department);
    }
    public static void main(String[] args){
        Foura e=new Foura();
        e.getEmployee();
        e.putEmployee();
    }
}
