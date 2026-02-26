package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class ArrayRotationByKthPosition {
    public static void main(String[] args) {
        // TC : O(n)
        // SC : O(1)
        int[] arr= {1,2,3,4,5,6,7};
        int k=9;
        rotateArray(arr,k);
        System.out.println("Rotated Array : " + Arrays.toString(arr));

        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 4;
        System.out.println("Original: " + Arrays.toString(arr1));
        rotateArray(arr1, k1);
        System.out.println("Rotated by " + k1 + ": " + Arrays.toString(arr1));
        // Output: [4, 5, 6, 7, 1, 2, 3]

        // Test Case 2
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("\nOriginal: " + Arrays.toString(arr2));
        rotateArray(arr2, k2);
        System.out.println("Rotated by " + k2 + ": " + Arrays.toString(arr2));
        // Output: [4, 5, 1, 2, 3]

        // Test Case 3: k > array length
        int[] arr3 = {1, 2, 3, 4, 5};
        int k3 = 12; // 12 % 5 = 2
        System.out.println("\nOriginal: " + Arrays.toString(arr3));
        rotateArray(arr3, k3);
        System.out.println("Rotated by " + k3 + " (effectively " + (k3 % arr3.length) + "): " + Arrays.toString(arr3));
        // Output: [4, 5, 1, 2, 3]

        // Test Case 4: k = 0
        int[] arr4 = {1, 2, 3, 4, 5};
        int k4 = 0;
        System.out.println("\nOriginal: " + Arrays.toString(arr4));
        rotateArray(arr4, k4);
        System.out.println("Rotated by " + k4 + ": " + Arrays.toString(arr4));
        // Output: [1, 2, 3, 4, 5] (no change)

        // Test Case 5: k = array.length
        int[] arr5 = {1, 2, 3, 4, 5};
        int k5 = 5;
        System.out.println("\nOriginal: " + Arrays.toString(arr5));
        rotateArray(arr5, k5);
        System.out.println("Rotated by " + k5 + ": " + Arrays.toString(arr5));
        // Output: [1, 2, 3, 4, 5] (full rotation = no change)

    }

    private static void rotateArray(int[] arr, int k) {
        k = k % arr.length;

//        Reverse whole array
        reverse(arr,0,arr.length-1);

//        Reverse first Kth Elem
        reverse(arr,0,k-1);

//        Reverse the rest of an array
        reverse(arr,k,arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
/**
 *
 * **Output:**
 * ```
 * Original: [1, 2, 3, 4, 5, 6, 7]
 * Rotated by 4: [4, 5, 6, 7, 1, 2, 3]
 *
 * Original: [1, 2, 3, 4, 5]
 * Rotated by 2: [4, 5, 1, 2, 3]
 *
 * Original: [1, 2, 3, 4, 5]
 * Rotated by 12 (effectively 2): [4, 5, 1, 2, 3]
 *
 * Original: [1, 2, 3, 4, 5]
 * Rotated by 0: [1, 2, 3, 4, 5]
 *
 * Original: [1, 2, 3, 4, 5]
 * Rotated by 5: [1, 2, 3, 4, 5]
 *
 */