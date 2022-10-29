package testa;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Yoyoyo";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        //MyMainEmployee anvi = new MyMainEmployee("ProgrammingWithAK", 12);
        MyMainEmployee anvi = new MyMainEmployee();
        //anvi.setName("AK");
        //anvi.setId(34);
        System.out.println(anvi.getId());
        System.out.println(anvi.getName());
    }
}