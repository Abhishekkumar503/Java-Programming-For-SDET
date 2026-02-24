package ArrayManupulationAndAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {18, 23, 13, 6, 47};
        int[] arr2 = {11, 25, 93, 64, 72};

        // Make sure Array should be sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted Array 1 : " + Arrays.toString(arr1));
        System.out.println("Sorted Array 2 : " + Arrays.toString(arr2));

        // creating new array to store sorted array
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // initailize the loop with i and j < arr1/2.lenght
        while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               arr3[k++] = arr1[i++];
           }
           else if (arr1[i] > arr2[j]) {
               arr3[k++] = arr2[j++];
           }
        }
        // Init while for item left in 1st array so this will copy same as it is
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        //Init while for item left in 2nd Array so this will copy same as it it
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        System.out.println("Final sorted and merged Array : " + Arrays.toString(arr3));
    }
}
