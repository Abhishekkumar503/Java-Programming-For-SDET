package ArraysAndCollections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 5, 4, 9, 6, 4, 0, 9};

        // Using LinkedHashMap collection so that it willnot break insterting order
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue() == 1)
           {
               System.out.println(entry.getKey() + " : " + entry.getValue());
               return;
           }
       }
    }
}
