package p1;
import java.util.*;
public class typist extends p1.staff{
    Scanner sc=new Scanner(System.in);
    protected int speed;
    public void setData()
    {
        super.setData();
        System.out.println("Enter the Speed");
        speed=sc.nextInt();
    }
    public void display()
    {
        super.display();
        System.out.println("Speed: "+speed);
    }
}