package CollectionAndGenerics.ListInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Manish");
        linkedList.add("Dinesh");
        linkedList.add("Achyut");
    }
}

/*
 * Linked List
 * similar to ArrayList
 * difference is in implementation
 * adding/removing is faster than ArrayList
 * retrieving is easier in ArrayList
 * */
