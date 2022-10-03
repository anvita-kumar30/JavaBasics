package test;

import java.util.*;
class areaConstructor{
    void square(int s)
    {
        int area;
        area=s*s;
        System.out.println("Area of square is: "+area);
    }
    void rect(int a, int b)
    {
        int area;
        area=a*b;
        System.out.println("Area of rectangle is: "+area);
    }
    void circle(int r)
    {
        double area;
        area=3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }
}
class areamain {
    public static void main(String args[]) {
        areaConstructor ar = new areaConstructor();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Square\n2. Rectangle\n3. Circle");
            System.out.println("Enter choice: ");
            option=sc.nextInt();
            switch(option) {
                case 1:
                    int s;
                    System.out.println("Enter side of square: ");
                    s=sc.nextInt();
                    ar.square(s);
                    break;
                case 2:
                    int a,b;
                    System.out.println("Enter length and breadth of rectangle: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ar.rect(a,b);
                    break;
                case 3:
                    int r;
                    System.out.println("Enter radius of circle: ");
                    r=sc.nextInt();
                    ar.circle(r);
                    break;
                case 4:
                    System.out.println("EXIT POINT");
                    break;
            }
        }while(option!=4);
    }
}