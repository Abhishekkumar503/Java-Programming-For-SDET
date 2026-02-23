package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {3,2,1,7,6,9};
        Arrays.sort(arr);
        int start = arr[0];
        int end = arr[arr.length - 1];
        for (int i = start; i <= end; i++) {
           if(!contains(arr,i))
           {
               System.out.println(i);
           }
        }
    }

    private static boolean contains(int[] arr, int i) {
        for(int num : arr) {
            if(num == i)
                return true;
        }
        return false;
    }
}
