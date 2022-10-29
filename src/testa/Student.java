package testa;

public class Student {
    public String name;
    public int id;
    public String branch;
    public static String collegeName;
    public static int count=0;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }

}
