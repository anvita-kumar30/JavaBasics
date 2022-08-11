package testa;
import java.util.Scanner;

public class Ch2_PS {
    public static void main(String[] args) {
        // q1. result of expression
//        float a = 7/4 * 9/2;  //wrong
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);

        //q2. encrypt grade by adding 8 and also decrypt to show the correct grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //q3. use comparison op whether no. is greater than user entered no.
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a>8);

      //q4. formula
//        float v = 20f, u = 15f, a = 5f, s = 2f;
//        float exepression = (v*v -u*u) / (2 * a * s);
//        System.out.println(exepression);

        //q5. find value
        System.out.println(7*49/7+35/7);
    }
}
