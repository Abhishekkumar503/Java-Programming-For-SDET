package ArraysAndCollections;

import java.util.HashMap;
import java.util.Map;

public class FindKeyForGivenValueInHashMap {
    public static void main(String[] args) {

//        Create Hashmap
        HashMap<String, String> map = new HashMap<>();

//        Add Some entries
        map.put("India", "New Delhi");
        map.put("USA", "New York");
        map.put("Germany", "Berlin");
        map.put("Japan", "Tokyo");

//        print all key and value
        System.out.println(map);

//        Set value for search
        String value = "New Delhi";

//        Loop Through each entry
        for(Map.Entry<String, String> entry : map.entrySet()){

//          Compare the map value to search value
            if(entry.getValue().equals(value)){
//                Print the enty after find in Map
                System.out.println(entry.getKey());
            }
        }
    }
}
