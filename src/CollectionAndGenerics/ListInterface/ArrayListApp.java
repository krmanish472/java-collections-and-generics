package CollectionAndGenerics.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        // ArrayList is a class that implements List interface
        // List interface extends Collection interface
        List<Integer> intValues = new ArrayList<>();
        intValues.add(20);
        intValues.add(30);
        intValues.add(50);

        // add value in specific index - not available in Collection
        intValues.add(2, 40);

        for (int i : intValues) {
            System.out.println(i);
        }

        intValues.forEach(System.out::println); // Stream API .. Lambda Expression

        int firstValue = intValues.get(0); // not available in Collection

        // not available in Collection [sort is available only for List]
        Collections.sort(intValues);
        Collections.reverse(intValues);
    }
}
