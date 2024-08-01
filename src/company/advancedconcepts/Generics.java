package company.advancedconcepts;

public class Generics {
    public static void main(String[] args) {
        // Create an instance of GenericClass with type Integer
        GenericClass<Integer> intInstance = new GenericClass<>();
        intInstance.setValue(123);
        System.out.println("Integer value: " + intInstance.getValue());

        // Create an instance of GenericClass with type String
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setValue("Hello, Generics!");
        System.out.println("String value: " + stringInstance.getValue());

        // Create an instance of GenericClass with type Double
        GenericClass<Double> doubleInstance = new GenericClass<>();
        doubleInstance.setValue(456.78);
        System.out.println("Double value: " + doubleInstance.getValue());
    }
}

