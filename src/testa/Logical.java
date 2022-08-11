package testa;

public class Logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = true;
        System.out.print("a && b= ");
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.print("c && d= ");
        if (c && d){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println();

        System.out.println("For Logical OR...");
        System.out.print("a && b= ");
        if (a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.print("c && d= ");
        if (c || d){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println();

        System.out.println("For Logical NOT...");
        System.out.print("Not(a) is= ");
        System.out.println(!a);
        System.out.print("Not(b) is= ");
        System.out.println(!b);
    }
}
