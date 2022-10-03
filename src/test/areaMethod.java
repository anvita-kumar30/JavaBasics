package test;

import java.util.*;
class areaMethod{
    double s,l,b;
    int r;
    void input()
    {
        this.s=s;
        this.l=l;
        this.b=b;
        this.r=r;
    }
    void areacal(double s)
    {
        System.out.println("Area of square is: "+(s*s));
    }
    void areacal(double l,double b)
    {
        System.out.println("Area of rectangle is: "+(l*b));
    }
    void areacal(int r)
    {
        System.out.println("Area of circle is: "+(3.14*r*r));
    }
}
class area{
    public static void main(String args[]){
        double s,l,b;
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        s=sc.nextDouble();
        System.out.println("Enter the length and breadth of the rectangle: ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("Enter the radius of the circle: ");
        r=sc.nextInt();
        areaMethod ob = new areaMethod();
        ob.input();
        ob.areacal(s);
        ob.areacal(l,b);
        ob.areacal(r);
    }
}