package company.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        int sum1 = math.add(2, 3);
        int sum2 = math.add(1, 2, 3);

        System.out.println("Sum of 2 and 3: " + sum1);
        System.out.println("Sum of 1, 2, and 3: " + sum2);
    }
}
