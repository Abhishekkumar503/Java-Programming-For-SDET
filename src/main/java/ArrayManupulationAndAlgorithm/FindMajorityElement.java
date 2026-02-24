package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class FindMajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 2, 3, 3, 3};
        int[] arr1 = {1, 2, 4, 4, 3, 4, 2, 4, 4, 4};
//       TC :  N Square
        System.out.println(findMajorityElem(arr));
        System.out.println(findMajorityElem(arr1));

//        TC : N Logn
        System.out.println(findMajorityElemBySorting(arr));
        System.out.println(findMajorityElemBySorting(arr1));

//        O(n) time, O(1) space
        System.out.println(findMajorityElemByMVA(arr));
        System.out.println(findMajorityElemByMVA(arr1));

    }
    private static int findMajorityElemByMVA(int[] arr) {
        int count = 0;
        int majority = -1;

        for (int i = 0; i < arr.length; i++) {
            /**
             * Logic:
             *
             * Start with count = 0
             * When count = 0, choose current element as candidate
             * If next element matches candidate, increase count
             * If next element differs, decrease count
             * The candidate that "survives" is the potential majority element
             */
            if(count == 0){
                majority = arr[i];  // Choose new candidate
                count = 1;
            }
            else if(arr[i] == majority){
                count++;  // Same as candidate, increase count
            }
            else{
                count--;  // Different from candidate, decrease count
            }
        }

        /**
         * Logic:
         *
         * Count how many times the candidate actually appears
         * If it appears more than n/2 times, it's the majority element
         * Otherwise, no majority element exists
         */
        int counter = 0;
        for (int i : arr)
            if(i == majority)
                counter++;
        if(counter > (arr.length)/2)
            return majority;
        return -1;
    }

    private static int findMajorityElemBySorting(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maj = arr[n/2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maj) {
                count++;
            }
        }
        if (count > n/2) {
            return maj;
        }
        return -1;
    }

    private static int findMajorityElem(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > arr.length/2){
                return  arr[i];
            }
        }
        return -1;
    }
}


/**
 * SDET Use Case:
 * Finding the most frequently failing test case in logs:
 * Log entries: [TEST_1, TEST_1, TEST_2, TEST_1, TEST_3, TEST_1, TEST_1]
 * Which test is failing more than 50% of the time?
 * Result: TEST_1 (appears 5 out of 7 times)
 */