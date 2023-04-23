package testa;

public class Ch4_PS {
    public static void main(String[] args) {
        //Question 1: find the value
        int a1 = 10;
        if(a1==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

        //Question 2: pass or fail
//        byte m1, m2, m3;  //marks is taken in 100 so byte
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }

        //Question 3: calculate income tax
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is: " + tax);

        //Question 4: to find out the day of the week
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter correct day number!");
//        }

        //Question 5: to find whether year entered is leap year or not
//        System.out.println("Enter a year: ");
//        Scanner sc=new Scanner(System.in);
//        short year = sc.nextShort();
//        if ((year%100!=0 && year%4==0) || (year%400==0)){
//                System.out.printf("The year %d is a leap year",year);
//        }
//        else{
//                System.out.printf("The year %d is not a leap year",year);
//        }

        //Question 6: to find out the type of website from the url
//        System.out.println("Enter the Website url: ");
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an Organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
//        else {
//            System.out.println("This is a random website");
//        }
    }
}
