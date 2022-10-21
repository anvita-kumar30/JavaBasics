package p2;
import p1.*;
import java.util.*;
public class adhoc extends p1.typist{
    Scanner sc=new Scanner(System.in);
    double pay;
    public void setData()
    {
        super.setData();
        System.out.println("Enter the basic pay");
        pay=sc.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("AdHoc pay: "+pay);
    }

}