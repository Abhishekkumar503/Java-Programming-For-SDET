package ArraysAndCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapContainsValueExample {
    public static void main(String[] args) {

        // Step -1  Create a linkedhashmap to store
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Step - 2 Adding some entities
        linkedHashMap.put(1, "Abhishek");
        linkedHashMap.put(2, "Sandip");
        linkedHashMap.put(3, "Kalin");
        linkedHashMap.put(4, "Udai");

        // Step - 3 print full LinkedHashMap
        System.out.println("Person Directory : " + linkedHashMap);

        // check if string is exist in map
        String str = "Kalin";
        if (linkedHashMap.containsValue(str)) {
            System.out.println("Person found at index : " + getKeyByValue(linkedHashMap,str));
        }
        else {
            System.out.println("Person not found!!");
        }

    }

    private static Integer getKeyByValue(LinkedHashMap<Integer, String> linkedHashMap, String str) {
        return linkedHashMap.entrySet()
                .stream()
                .filter(entry -> str.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
