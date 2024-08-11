package company.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        int nums = numbers.get(1); // num = 15
        System.out.println(nums);

        numbers.set(1, 25); // [10, 25, 20]

        for (Integer num : numbers) {
            System.out.println(num);
        }

        numbers.remove(1); // [10, 20]

        for (Integer num : numbers) {
            System.out.println(num);
        }

        numbers.remove(Integer.valueOf(10)); // [20]

        int size = numbers.size(); // size = 1
        System.out.println(size);

        numbers.add(25);
        numbers.add(30);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        boolean empty = numbers.isEmpty(); // false
        System.out.println(empty);

        numbers.clear(); // []

        boolean containsTen = numbers.contains(10); // false
        System.out.println(containsTen);

        numbers.add(40);
        Object[] arr = numbers.toArray();
        for (Object num : arr) {
            System.out.println(num);
        }
    }
}

