package p1;
import java.util.*;
public class staff{
    Scanner sc=new Scanner(System.in);
    int code;
    protected String name;
    protected String address;
    public void setData()
    {
        System.out.println("Enter Code: ");
        code=sc.nextInt();
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Enter Address: ");
        address=sc.next();
    }
    public void display()
    {
        System.out.println("Details are: ");
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}