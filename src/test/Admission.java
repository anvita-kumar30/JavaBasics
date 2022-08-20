package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Admission {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Mathematics marks: ");
        double math=Double.parseDouble(br.readLine());
        System.out.println("Enter Physics marks: ");
        double phy=Double.parseDouble(br.readLine());
        System.out.println("Enter Chemistry marks: ");
        double chem=Double.parseDouble(br.readLine());
        double total=math+phy+chem;
        if(math>=60 && phy>=50 && chem>=40 && total>=200)
            System.out.println("Student is eligible for the course");
        else
            System.out.println("Student is not eligible for the course");
    }
}
