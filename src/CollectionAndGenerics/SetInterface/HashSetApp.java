package CollectionAndGenerics.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApp {
    public static void main(String[] args) {
        Set<Integer> hashSetValues = new HashSet<>();

        System.out.println(hashSetValues.add(87));
        System.out.println(hashSetValues.add(97));
        System.out.println(hashSetValues.add(34));
        System.out.println(hashSetValues.add(92));
        // this value gets ignored - Sets support only unique value
        System.out.println(hashSetValues.add(34));

        for (int i : hashSetValues) {
            System.out.println(i);
        }
    }
}

/*
 * HashSet
 * Makes use of Hash code
 * Value is not stored in sequence
 * Does not support duplicate value (Set behavior)
 * */
