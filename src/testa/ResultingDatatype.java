package testa;

public class ResultingDatatype {
    public static void main(String[] args) {
        byte x=5;
        int y=6;
        short z=8;
        int a=y+z;
        float b=6.54f+x;
        System.out.println(b);
        System.out.println();

        //increment and decrement operators (will operate on all datatypes except booleans)
        int i=56;
        //int b=i++; //first b is assigned i (56) then i is incremented
        int j=67;
        //int c=++j;   //first j is incremented c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println();

        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        System.out.println();

        //quick quiz
        int l=7;
        int m=++l*8;
        System.out.println(m);
        System.out.println();

        char ch='B';
        System.out.println(ch++);
        System.out.println(ch);
    }
}
