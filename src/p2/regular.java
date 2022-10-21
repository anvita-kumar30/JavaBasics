package p2;
import p1.*;
import java.util.*;
public class regular extends p1.typist{
    Scanner sc=new Scanner(System.in);
    double basicpay;
    public void setData()
    {
        System.out.println("Enter the basic pay of the typist");
        basicpay=sc.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("Regular pay: "+basicpay);
    }
}
