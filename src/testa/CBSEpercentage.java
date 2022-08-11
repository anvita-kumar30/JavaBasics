package testa;
import java.util.Scanner;

class Subject{
    int max=100;
    int obtd;
}

public class CBSEpercentage {
    public static void main(String[] args) {
        Subject s1=new Subject();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter total marks of the subject(Eg:- 100,80): ");
        int total_marks=scn.nextInt();
        System.out.println("Enter Maths marks: ");
        s1.obtd=scn.nextInt();
        Subject s2=new Subject();
        System.out.println("Enter Science marks: ");
        s2.obtd=scn.nextInt();
        Subject s3=new Subject();
        System.out.println("Enter English marks: ");
        s3.obtd=scn.nextInt();
        Subject s4=new Subject();
        System.out.println("Enter Social Science marks: ");
        s4.obtd=scn.nextInt();
        Subject s5=new Subject();
        System.out.println("Enter Hindi marks: ");
        s5.obtd=scn.nextInt();
        float tobtd=(s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        float per=tobtd*100/(total_marks*5);
        System.out.println("Percentage obtained: "+per);
    }
}
