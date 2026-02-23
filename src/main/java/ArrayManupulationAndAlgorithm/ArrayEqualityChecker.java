package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class ArrayEqualityChecker {
    public static void main(String[] args) {

        //Create 1st array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 5};

        boolean areEqual = Arrays.equals(arr1, arr2);

        if(areEqual)
            System.out.println("Your arrays are the same : " + areEqual );
        else
            System.out.println("Your arrays are not the same");
    }
}
