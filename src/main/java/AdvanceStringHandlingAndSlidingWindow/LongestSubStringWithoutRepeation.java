package AdvanceStringHandlingAndSlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithoutRepeation {
    public static void main(String[] args) {
       
        String str = "abcabcbb";
        System.out.println("Longest substring without repeating characters : " + lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // If the character is ready in the window
            if(map.containsKey(ch) && map.get(ch) >= start){
                start = map.get(ch) + 1;
            }
            map.put(ch, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}

/**
 * output : Longest substring without repeating characters : 3
 */
