package company.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Accessing elements
        System.out.println(fruits.get(1)); // Banana

        // Modifying elements
        fruits.set(1, "Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing elements
        fruits.remove("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.add("Mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sorting
        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if a list is empty
        System.out.println(fruits.isEmpty()); // false

        // Clearing the list
        fruits.clear();

        // Size of the list
        System.out.println(fruits.size()); // 0


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // [10]
        numbers.add(20); // [10, 20]
        numbers.add(1, 15); // [10, 15, 20]

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

