package testa;

public class Conditionals {
    public static void main(String[] args) {
        int age=13;
        boolean cond = (age>18);
//        if(age>18){  //relational op
        if(cond){
            System.out.println("Yes bro you can drive!");
        }
        else{
            System.out.println("No bro you cannot drive yet!");
        }
    }
}
