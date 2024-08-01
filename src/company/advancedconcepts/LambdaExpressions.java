package company.advancedconcepts;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.forEach(fruit -> System.out.println(fruit));
    }
}

