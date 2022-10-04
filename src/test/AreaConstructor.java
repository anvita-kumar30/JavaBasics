package test;

import java.util.Scanner;

class AreaConstructor {
    int side, a, b;
    float radius;

    AreaConstructor(int s) {
        side = s;
    }

    AreaConstructor(int a1, int b1) {
        a = a1;
        b = b1;
    }

    AreaConstructor(float r) {
        radius = r;
    }

    int area(int side) {
        return side * side;
    }

    int area(int a, int b) {
        return a * b;
    }

    float area(float radius) {
        return (float) (3.14 * radius * radius);
    }
}

class AreaMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        System.out.println("Enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println("Enter radius of circle: ");
        float radius = sc.nextFloat();
        AreaConstructor ar1 = new AreaConstructor(side);
        AreaConstructor ar2 = new AreaConstructor(length, breadth);
        AreaConstructor ar3 = new AreaConstructor(radius);
        int a1 = ar1.area(side);
        System.out.println("Area of square is: " + a1);
        int a2 = ar2.area(length, breadth);
        System.out.println("Area of rectangle is: " + a2);
        float a3 = ar3.area(radius);
        System.out.println("Area of circle is: " + a3);
    }
}