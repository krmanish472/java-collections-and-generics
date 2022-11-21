package CollectionAndGenerics.ComparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceApp {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

        /*Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?1:0
            }
        };*/

        Comparator<Integer> comparator = (o1, o2) -> o1 > o2 ? 1 : -1;

        // Collections.sort(values, comparator);
        values.sort(comparator);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
