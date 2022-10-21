import p2.*;

import java.util.Scanner;

class testpack{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int option, z;
        do {
            System.out.println("\n***STAFF***\n1. Typist\n2. Regular\n3. Ad-Hoc");
            System.out.println("Enter your option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Typist data");
                    typist t = new typist();
                    t.setdata();
                    t.display();
                    break;
                case 2:
                    System.out.println("Enter Regular data");
                    regular r = new regular();
                    r.setData();
                    r.display();
                    break;
                case 3:
                    System.out.println("Enter Ad-Hoc data");
                    adhoc ad = new adhoc();
                    ad.setdata();
                    ad.display();
                    break;
            }
            System.out.println("Do you want to continue (enter 1 for yes else no)");
            z = sc.nextInt();
        } while (z == 1);
    }
}