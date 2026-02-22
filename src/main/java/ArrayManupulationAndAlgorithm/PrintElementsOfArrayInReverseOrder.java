package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class PrintElementsOfArrayInReverseOrder {
    public static void main(String[] args) {

        // Create Array Of Integer
        int[] nums = {1,2,3,4,5,6,7,8};

        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
        System.out.print("Array in reverse order : ");

        //this will sove by two pointers
        int first = 0 ;
        int last = nums.length-1;
        while(last>first){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }

        Arrays.stream(nums).forEach(System.out::print);

    }
}
