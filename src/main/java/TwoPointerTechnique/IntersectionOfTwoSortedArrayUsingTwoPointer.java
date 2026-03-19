package TwoPointerTechnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrayUsingTwoPointer {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 10, 9, 5};
        int[] nums2 = {6, 7, 8, 9, 10};

         List<Integer> intersection = findInterSection(nums1,nums2);
         System.out.println(intersection);
    }

    private static List<Integer> findInterSection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list1.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else{
                j++;
            }
        }
        return list1;
    }
}
