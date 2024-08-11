package company.collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Accessing elements
        System.out.println(map.get(2)); // Banana

        // Iterating over key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing elements
        map.remove(3);

        // Iterating over keys
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Checking if a key exists
        System.out.println(map.containsKey(1)); // true

        boolean hasValue = map.containsValue("Mango"); // false
        System.out.println(hasValue);

        int size = map.size(); // 2
        System.out.println(size);

        // Replacing values
        map.replace(1, "Orange");

        // Iterating over values
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Merging values
        map.merge(2, "Grapes", (oldValue, newValue) -> oldValue + ", " + newValue);

        // Iterating over values
        for (String value : map.values()) {
            System.out.println(value);
        }

        map.compute(1, (k, v) -> v.toLowerCase()); // Converts the value of key 1 to uppercase

        // Iterating over values
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Clearing the map
        map.clear();

        boolean empty = map.isEmpty(); // false
        System.out.println(empty);
    }
}
