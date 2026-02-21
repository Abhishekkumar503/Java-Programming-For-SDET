package ArraysAndCollections;

import java.util.TreeMap;

public class CheckSpecificValueTreeMap {
    public static void main(String[] args) {
        // Step 1 create a tree map that map integer key to string values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Step 2 Add Some key-value pair to treemap
        treeMap.put("Ben", 1);
        treeMap.put("kevin", 2);
        treeMap.put("Max", 3);
        treeMap.put("Gwen", 4);

        //step 3 Print tree map
        System.out.println("TreeMap: " + treeMap);

        //Step 4 Define the value we want to search for
        String search = "kevin";

        // step 5 check if it containkey
        System.out.println(treeMap.containsKey(search));

        // step 6 check if it containvalue
        int value = 3;
        System.out.println(treeMap.containsValue(value));

    }
}
