package TwoPointerTechnique;

import java.util.Arrays;

public class MoveZerosToTheRight {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 2, 0, 10, 9, 5};
        System.out.println("Moving Zeros the Right : ");
        movingZerosToRight(nums1);
    }

    private static void movingZerosToRight(int[] nums1) {
        int n = nums1.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums1[i] != 0) {
                if(i != nonZeroIndex) {
                    int temp = nums1[i];
                    nums1[i] = nums1[nonZeroIndex];
                    nums1[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
        for(int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
