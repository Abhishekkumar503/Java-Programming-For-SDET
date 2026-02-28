package SearchingAlgorithm;

public class RotatedSortedArray {
    public static void main(String[] args) {
        // program to find the index od an element in a rotated sorted array
        int[] arr = {6,7,9,15,19,2,3};
        int target = 15;
        /**
         * TC : O(log n) - Binary search
         * SC : O(1) - Only Variables
         */
        // Test Case 1: Element exists
        System.out.println("Array: [6, 7, 9, 15, 19, 2, 3]");
        System.out.println("Search 15: Index = " + search(arr, 15));  // 3
        System.out.println("Search 2: Index = " + search(arr, 2));    // 5
        System.out.println("Search 7: Index = " + search(arr, 7));    // 1
        System.out.println("Search 19: Index = " + search(arr, 19));  // 4

        // Test Case 2: Element doesn't exist
        System.out.println("Search 10: Index = " + search(arr, 10));  // -1
        System.out.println("Search 1: Index = " + search(arr, 1));    // -1

        // Test Case 3: No rotation
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("\nArray: [1, 2, 3, 4, 5, 6, 7]");
        System.out.println("Search 4: Index = " + search(arr2, 4));   // 3

        // Test Case 4: Complete rotation
        int[] arr3 = {7, 1, 2, 3, 4, 5, 6};
        System.out.println("\nArray: [7, 1, 2, 3, 4, 5, 6]");
        System.out.println("Search 7: Index = " + search(arr3, 7));   // 0
        System.out.println("Search 1: Index = " + search(arr3, 1));   // 1

    }
    private static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if(target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

/**
 * Q1: What if array has duplicates?
 * This algorithm may fail. Need modified version.
 *
 * Q2: Find rotation count?
 * Find index of minimum element = rotation count
 *
 */