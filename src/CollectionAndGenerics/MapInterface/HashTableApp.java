package CollectionAndGenerics.MapInterface;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("name", "Manish");
        map.put("actor", "John");
        map.put("ceo", "Marisa");
        // keys can not be duplicate as it is "Set"
        // hence map will replace "actor = John" with "actor = Akshay"
        map.put("actor", "Akshay");

        System.out.println(map);
        System.out.println(map.get("name"));
        System.out.println(map.getOrDefault("address", "Bangalore"));

        Set<String> keys = map.keySet(); // => returns Set of key
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

/*
 * similar to HashMap
 * */
