package company.polymorphism;


public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();
    }
}
