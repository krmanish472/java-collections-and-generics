package CollectionAndGenerics.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        Map<String, Integer> empIds = new HashMap<>();

        // puts to map
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 78965);

        // {Carl=54321, John=12345, Jerry=78965}
        System.out.println(empIds);

        // 54321
        System.out.println(empIds.get("Carl"));

        // true
        System.out.println(empIds.containsKey("John"));
        //false
        System.out.println(empIds.containsKey("Manish"));

        // true
        System.out.println(empIds.containsValue(54321));

        // add new or update if exists
        empIds.put("John", 14788);
        // {Carl=54321, John=1478, Jerry=78965}
        System.out.println(empIds);

        // add only if it does not exits
        empIds.putIfAbsent("Kumar", 3696);
        // {Kumar=3696, Carl=54321, John=14788, Jerry=78965}
        System.out.println(empIds);

        // update if exists .. don't add new
        empIds.replace("Manish", 12589);
        // {Kumar=3696, Carl=54321, John=14788, Jerry=78965}
        System.out.println(empIds);

        // removes the entry with this key
        empIds.remove("Kumar");
        // {Carl=54321, John=14788, Jerry=78965}
        System.out.println(empIds);
    }
}
