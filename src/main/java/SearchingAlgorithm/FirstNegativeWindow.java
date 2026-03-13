package SearchingAlgorithm;

import java.util.*;

public class FirstNegativeWindow {
    public static void main(String[] args) {
        int[] arr = {1, 32, 43, -2, 6, -7, -8, -4};
        int k = 3;

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();  // Stores indices of negative numbers

        for (int i = 0; i < arr.length; i++) {
            // Step 1: Add current index to queue if element is negative
            if (arr[i] < 0) {
                queue.add(i);  // ✅ Store INDEX, not value
            }

            // Step 2: Process window when we have at least k elements
            if (i >= k - 1) {
                // Step 3: Remove indices that are outside current window
                // Window range: [i-k+1, i]
                // So remove indices < i-k+1, which means <= i-k
                while (!queue.isEmpty() && queue.peek() <= i - k) {
                    queue.poll();
                }

                // Step 4: First negative in window or 0
                if (!queue.isEmpty()) {
                    result.add(arr[queue.peek()]);  // Get value at index
                } else {
                    result.add(0);  // No negative in window
                }
            }
        }

        // Print results
        System.out.println("First negative in each window:");
        result.forEach(System.out::println);
    }
}
