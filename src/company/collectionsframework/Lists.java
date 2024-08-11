package company.collectionsframework;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // [10]
        numbers.add(20); // [10, 20]
        numbers.add(1, 15); // [10, 15, 20]

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

