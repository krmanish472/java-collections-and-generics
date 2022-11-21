package CollectionAndGenerics.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
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
            System.out.println(key + " : " + map.get(key));
        }

        // returns map as set
        Set<Map.Entry<String, String>> values = map.entrySet();
        for (var value : values) {
            System.out.println(value.getKey() + " : " + value.getValue());
            // => we can update value for any matching key, provided if statement
            value.setValue("some-value");
        }
    }
}

/*
 * HashMap
 * Makes use of Hash code
 * Value is not stored in sequence
 * Keys is Map<K,V> can not be duplicate as it is "Set"
 * If duplicate is provided, the original value will be replaced with the new one
 * To have stored in sequence, use LinkedHashMap
 * To have sorted in order, use TreeHashMap
 * */
