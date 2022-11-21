package CollectionAndGenerics.VectorClass;

import java.util.Vector;

public class VectorClassApp {

    public static void main(String[] args) {
        // Vector is a class that implements List interface
        // List interface extends Collection interface
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        vector.remove(0);

        System.out.println(vector.capacity());

        for (int i : vector) {
            System.out.println(i);
        }
    }
}
