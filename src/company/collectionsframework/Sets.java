package company.collectionsframework;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
