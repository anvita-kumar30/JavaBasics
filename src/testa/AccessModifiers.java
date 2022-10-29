package testa;

class MyEmployee{
    private int id;
    private String name;

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
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee anvi = new MyEmployee();
        // anvi.id = 45;
        // anvi.name = "Anvita"; --> Throws an error due to private access modifier
        anvi.setName("Anvita");
        System.out.println(anvi.getName());
        anvi.setId(234);
        System.out.println(anvi.getId());
    }
}