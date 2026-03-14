package SearchingAlgorithm;

import java.util.HashMap;

public class LongestSubstringWithoutRepativeChar {
    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters :" + lengthOfLongestSubstring(str));
        System.out.println("Length of the longest substring without repeating characters :" + lengthOfLongestSubstringExplain(str));

    }

    private static int lengthOfLongestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            map.put(c, i);

            // Calculate the lengthof the current window and update max length
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    private static int lengthOfLongestSubstringExplain(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            System.out.println("------------------------------------------------");
            System.out.println("Current Index: " + i + " Character: " + c);

            // Check duplicate
            if (map.containsKey(c) && map.get(c) >= start) {

                System.out.println("Duplicate found: " + c);
                System.out.println("Previous index: " + map.get(c));

                start = map.get(c) + 1;

                System.out.println("Move start to: " + start);
            }

            // Update map
            map.put(c, i);

            // Current window length
            int currentLength = i - start + 1;

            max = Math.max(max, currentLength);

            // Print current window
            System.out.println("Current Window: " + str.substring(start, i + 1));
            System.out.println("Window Length: " + currentLength);
            System.out.println("Max Length So Far: " + max);

        }

        return max;
    }
}

/**
 * Output
 * Length of the longest substring without repeating characters :3
 * ------------------------------------------------
 * Current Index: 0 Character: a
 * Current Window: a
 * Window Length: 1
 * Max Length So Far: 1
 * ------------------------------------------------
 * Current Index: 1 Character: b
 * Current Window: ab
 * Window Length: 2
 * Max Length So Far: 2
 * ------------------------------------------------
 * Current Index: 2 Character: c
 * Current Window: abc
 * Window Length: 3
 * Max Length So Far: 3
 * ------------------------------------------------
 * Current Index: 3 Character: a
 * Duplicate found: a
 * Previous index: 0
 * Move start to: 1
 * Current Window: bca
 * Window Length: 3
 * Max Length So Far: 3
 * ------------------------------------------------
 * Current Index: 4 Character: b
 * Duplicate found: b
 * Previous index: 1
 * Move start to: 2
 * Current Window: cab
 * Window Length: 3
 * Max Length So Far: 3
 * ------------------------------------------------
 * Current Index: 5 Character: c
 * Duplicate found: c
 * Previous index: 2
 * Move start to: 3
 * Current Window: abc
 * Window Length: 3
 * Max Length So Far: 3
 * ------------------------------------------------
 * Current Index: 6 Character: b
 * Duplicate found: b
 * Previous index: 4
 * Move start to: 5
 * Current Window: cb
 * Window Length: 2
 * Max Length So Far: 3
 * ------------------------------------------------
 * Current Index: 7 Character: b
 * Duplicate found: b
 * Previous index: 6
 * Move start to: 7
 * Current Window: b
 * Window Length: 1
 * Max Length So Far: 3
 * Length of the longest substring without repeating characters :3
 *
 * Process finished with exit code 0
 */