package TwoPointerTechnique;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(System.out::print);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
        Arrays.stream(arr).forEach(System.out::print);
    }
}
