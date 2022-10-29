package testa;

public class StudentDemo {
        public static void main(String args[])
        {
//creating objects      
            Student emp1 = new Student("John", 20000);
            Student emp2 = new Student("Tom", 60000);
            Student emp3 = new Student("Andrew",29000);
            Student emp4 = new Student("Mathew", 50000);
//prints total number of objects  
            System.out.println ("There are " + Student.count + " objects in this class.");
        }
    }

