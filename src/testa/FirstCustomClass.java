package testa;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class FirstCustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee anvi = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        anvi.id = 12;
        anvi.salary = 34;
        anvi.name = "Anvita Kumar";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Evans";

        // Printing the Attributes
        anvi.printDetails();
        john.printDetails();
        int salary = anvi.getSalary();
        System.out.println(anvi.salary);
        int salary2 = john.getSalary();
        System.out.println(john.salary);
        // System.out.println(anvi.id);
        // System.out.println(anvi.name);
    }
}