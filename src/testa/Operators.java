package testa;

public class Operators {
    public static void main(String[] args) {
        int a=4;
//        int b=6-a; //arithmetic op   (cannot work with booleans)
        int c=6%a;  //modulo operator  (can work on floats and doubles)
//        4.8%1.1 -->returns decimal remainder
        int b=9;  //assignment op
        b +=3;  //assignment op
        System.out.println(c);
        System.out.println(b);
        System.out.println(6==8); //comparison op
        System.out.println(6<8); //comparison op
        System.out.println(64>5 && 64<77);  //logical op
        System.out.println(64>5 || 64>77);  //logical op
        System.out.println(2&3);   //bitwise op
    }
}
