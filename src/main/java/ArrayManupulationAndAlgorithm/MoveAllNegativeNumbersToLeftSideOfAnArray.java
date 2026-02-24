package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class MoveAllNegativeNumbersToLeftSideOfAnArray {
    public static void main(String[] args) {
        /**
         * Pointer 1 : Start from the beginning from the array and look for a positive number
         * Pointer 2 : Start from the end from the array and look for a positive number
         *
         * This uses the Two-Pointer Approach:
         *
         * Left pointer starts at beginning
         * Right pointer starts at end
         * Move left pointer right until it finds a positive number
         * Move right pointer left until it finds a negative number
         * Swap them
         * Repeat until pointers meet
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int[] arr = {-6,23,43,-1, 2, -3, 6, 5};
        int[] arr1 = {1, -2, 3, -4, 5, -6, 7, -8};

        rearrange(arr);
        System.out.println();
        rearrange(arr1);

    }
    public static void rearrange(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        int left = 0;
        int right = len - 1;

        while(left < right){
            while(left < len && arr[left] < 0){
                left++;
            }
            while(right > 0 && arr[right] >= 0){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println("Final Array : " + Arrays.toString(arr));
    }
}
