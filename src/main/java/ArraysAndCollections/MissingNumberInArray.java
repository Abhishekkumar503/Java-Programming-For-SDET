package ArraysAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 5 };
        findMissingNumbers(arr);
    }

    private static void findMissingNumbers(int[] arr) {
        Arrays.sort(arr);

        int firstMissing = arr[0];
        int lastMissing = arr[arr.length - 1];

        ArrayList<Integer> missingArray = new ArrayList<>();

        //Check for thenumber is in the range from first to last.
        for (int i = firstMissing; i <= lastMissing; i++) {
            if(!contains(arr ,i)) {
                missingArray.add(i);
            }
        }

        //Print the missing number
        if (missingArray.size() > 0) {
            System.out.println("Missing Number : " + missingArray);
        }
        else {
            System.out.println("No Missing Number found!!");
        }
    }

    private static boolean contains(int[] arr, int i) {
        for(int n : arr)
        {
            if(n == i)
                return true;
        }
        return false;
    }
}
