package ArraysAndCollections;

import java.util.Arrays;

public class KthSmallestElementInAnArray {
    public static void main(String[] args) {

//        Define the input array
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        finding Kth smallest array
        int KthSmallest = Arrays.stream(arr).skip(k-1).findFirst().getAsInt();
        System.out.println("The Kth Smallest number : " + KthSmallest);

    }
}
