package SearchingAlgorithm;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {

        // Time: O(n), Space: O(min(n, m))
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating character: "
                + lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        // HashMap: character → latest index
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;      // Maximum length found
        int start = 0;    // Start of current window

        // i is the end of current window
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character exists AND is within current window
            if (map.containsKey(c) && map.get(c) >= start) {
                // Move start past the previous occurrence
                start = map.get(c) + 1;
            }

            // Update character's latest position
            map.put(c, i);

            // Update maximum length
            // Current window length = i - start + 1
            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}

/**
 * ## **Visual Walkthrough:**
 * ```
 * s = "a b c a b c b b"
 *      0 1 2 3 4 5 6 7
 *
 * Iteration 0: i=0, char='a'
 *   Window: [a]
 *   start=0, end=0
 *   Length = 0-0+1 = 1
 *   max = 1
 *
 * Iteration 1: i=1, char='b'
 *   Window: [a b]
 *   start=0, end=1
 *   Length = 1-0+1 = 2
 *   max = 2
 *
 * Iteration 2: i=2, char='c'
 *   Window: [a b c]
 *   start=0, end=2
 *   Length = 2-0+1 = 3
 *   max = 3 ✅
 *
 * Iteration 3: i=3, char='a'
 *   'a' already exists at index 0
 *   map.get('a') = 0, which is >= start(0)
 *   ❌ Duplicate found!
 *   Move start to 0+1 = 1
 *   Window: [b c a]
 *   start=1, end=3
 *   Length = 3-1+1 = 3
 *   max = 3
 *
 * Iteration 4: i=4, char='b'
 *   'b' already exists at index 1
 *   map.get('b') = 1, which is >= start(1)
 *   ❌ Duplicate found!
 *   Move start to 1+1 = 2
 *   Window: [c a b]
 *   start=2, end=4
 *   Length = 4-2+1 = 3
 *   max = 3
 */
