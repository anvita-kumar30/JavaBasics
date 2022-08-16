package testa;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }

        String var = "Saurabh";
        //var can be an integer, character or string in java
        switch (var){
            case "Shubham":
                System.out.println("You are going to become an Adult!");
                break;
            case "Saurabh":
                System.out.println("You are going to join a Job!");
                break;
            case "Vishaka":
                System.out.println("You are going to get Retired!");
                break;
            default:
                System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks!");

        //Enhaced switch case
//        String var = "Saurabh";
//        switch (var) {
//            case "Shubham" -> System.out.println("You are going to become an Adult!");
//            case "Saurabh" -> System.out.println("You are going to join a Job!");
//            case "Vishaka" -> System.out.println("You are going to get retired!");
//            default -> System.out.println("Enjoy Your life!");
//        }
//        System.out.println("Thanks for using my Java Code!");
    }
}
