package testa;

public class OpPrece {
    public static void main(String[] args) {
        //Precedence
        //Associativity(tie breaker)
        int aa=6*5-34/2;
        int bb=60/5-34*2;
        System.out.println(aa);
        System.out.println(bb);

        //quick quiz
        int x=6;
        int y=2;
        int k=(x-y)/2;
        System.out.println(k);

        int b=1,c=4,a=5;
        int z=b*b-(4*a*c)/(2*a);
//        int z=(b*b-4*a*c)/(2*a);
        System.out.println(z);

        int v=2,u=1;
        int w=v*v-u*u;
        System.out.println(w);

        int d=3,i=4,f=2;
        int g=d*i-f;
        System.out.println(g);
    }
}
