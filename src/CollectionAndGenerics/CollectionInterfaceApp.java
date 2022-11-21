package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionInterfaceApp {
    public static void main(String[] args) {
        // Collection
        Collection values = new ArrayList();
        values.add(3);
        values.add("Manish");
        values.add(5.8);
        values.add(5.5f);

       /* Iterator i = values.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }*/

        for (Object i : values) {
            System.out.println(i);
        }

        // Generics
        Collection<Integer> intValues = new ArrayList<>();
        intValues.add(1);
        intValues.add(2);
        intValues.add(3);
        for (int i : intValues) {
            System.out.println(i);
        }

        intValues.remove(3);

        for (int i : intValues) {
            System.out.println(i);
        }
    }
}
