package company.collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate, won't be added

        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.remove("Mango");

        boolean hasApple = set.contains("Apple"); // true
        System.out.println(hasApple);

        int size = set.size(); // 2
        System.out.println(size);

        for (String fruit : set) {
            System.out.println(fruit);
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        boolean empty = set.isEmpty(); // false
        System.out.println(empty);

        set.clear(); // Now the set is empty


        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Orange");
        anotherSet.add("Grapes");
        set.addAll(anotherSet);

        for (String fruit : anotherSet) {
            System.out.println(fruit);
        }

        set.removeAll(anotherSet);
        for (String fruit : anotherSet) {
            System.out.println(fruit);
        }

        set.retainAll(anotherSet);
        for (String fruit : anotherSet) {
            System.out.println(fruit);
        }

        Object[] arr = set.toArray();
        for (Object fru : arr) {
            System.out.println(fru);
        }

        HashSet<String> setFromCollection = new HashSet<>(anotherSet);
        HashSet<Integer> setWithCapacity = new HashSet<>(10); // initial capacity of 10

    }
}
