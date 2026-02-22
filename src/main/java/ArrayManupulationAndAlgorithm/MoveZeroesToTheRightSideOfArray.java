package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class MoveZeroesToTheRightSideOfArray {
    public static void main(String[] args) {
        /**
         * This will solve by two pointer technique
         */
        int[] arr = {0,1,0,3,12};
        int nonZeroIndex = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
