package test;

import java.util.*;
class staff {
    int code;
    String name, address;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter code:");
        code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
    }
    void display() {
        System.out.println("Details are: ");
        System.out.println("The code is " + code);
        System.out.println("The name is " + name);
        System.out.println("The address is " + address);
    }
}
class teacher extends staff {
    String subj, div;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        super.getdata();
        System.out.println("Enter subject:");
        subj = sc.nextLine();
        System.out.println("Enter division:");
        div = sc.nextLine();
    }
    void display() {
        super.display();
        System.out.println("The subject is " + subj);
        System.out.println("The div is " + div);
    }
}
class typist extends staff {
    int speed;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        super.getdata();
        System.out.println("Enter the speed:");
        speed = sc.nextInt();
    }
    void display() {
        super.display();
        System.out.println("The speed is " + speed);
    }
}
class officer extends staff {
    char grade;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        super.getdata();
        System.out.println("Enter grade:");
        grade = sc.next().charAt(0);
    }
    void display() {
        super.display();
        System.out.println("The grade is " + grade);
    }
}
class regular extends typist {
    double basicpay;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        super.getdata();
        System.out.println("Enter the basic pay of the typist:");
        basicpay = sc.nextDouble();
    }
    void display() {
        super.display();
        System.out.println("Regular pay: "+basicpay);
    }
}
class adhoc extends typist {
    double pay;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        super.getdata();
        System.out.println("Enter the basic pay:");
        pay = sc.nextInt();
    }
    void display() {
        super.display();
        System.out.println("AdHoc pay: " + pay);
    }
}
class Inheritance {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int option, z;
        do {
            System.out.println("\n***STAFF***\n1. Teacher\n2. Officer\n3. Typist\n4. Regular\n5. Ad-Hoc");
            System.out.println("Enter your option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Teacher data");
                    teacher t = new teacher();
                    t.getdata();
                    t.display();
                    break;
                case 2:
                    System.out.println("Enter Officer data");
                    officer o = new officer();
                    o.getdata();
                    o.display();
                    break;
                case 3:
                    System.out.println("Enter Typist data");
                    typist tt = new typist();
                    tt.getdata();
                    tt.display();
                    break;
                case 4:
                    System.out.println("Enter Regular data");
                    regular r = new regular();
                    r.getdata();
                    r.display();
                    break;
                case 5:
                    System.out.println("Enter Ad-Hoc data");
                    adhoc ad = new adhoc();
                    ad.getdata();
                    ad.display();
                    break;
            }
            System.out.println("Do you want to continue (enter 1 for yes else no)");
            z = sc.nextInt();
        } while (z == 1);
    }
}

//import java.util.*;
//class Staff {
//    public int code(int a) {
//        return a;
//    }
//    public String name(String s) {
//        return s;
//    }
//    public String Address(String a) {
//        return a;
//    }
//}
//class Teacher extends Staff {
//    public String subject(String sub) {
//        return sub;
//    }
//
//    public int standard(int c) {
//        return c;
//    }
//}
//class Typist extends Staff {
//    public float speed(float s) {
//        return s;
//    }
//}
//class Officer extends Staff {
//    public String grade(String g) {
//        return g;
//    }
//}
//class Regular extends Typist {
//    public float basicPay(float pay) {
//        return pay;
//    }
//}
//class AdHoc extends Typist {
//     public float pay(float pay) {
//         return pay;
//     }
//}
//class Inheritance {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//    }
//}