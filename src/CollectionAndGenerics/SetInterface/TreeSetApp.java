package CollectionAndGenerics.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();

        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(34));
        System.out.println(values.add(92));
        // this value gets ignored - Sets support only unique value
        System.out.println(values.add(34));

        for (int i : values) {
            System.out.println(i);
        }
    }
}

/*
 * TreeSet
 * Value is stored in ascending order
 * Does not support duplicate value (Set behavior)
 * */
