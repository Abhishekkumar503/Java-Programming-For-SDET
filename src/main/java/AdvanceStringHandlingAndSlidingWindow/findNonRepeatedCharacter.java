package AdvanceStringHandlingAndSlidingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class findNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abcfadbecbb";
        System.out.println("First Non repeating Character : " + nonRepeating(str));
    }

    private static char nonRepeating(String str) {
        // here Linked HashMap is used because here we need to store same given string
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return '\0'; // no non-repeating character found
    }
}

/**
 * '\0' is null in ASCII
 */