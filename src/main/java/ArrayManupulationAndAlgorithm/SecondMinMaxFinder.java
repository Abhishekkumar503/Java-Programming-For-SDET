package ArrayManupulationAndAlgorithm;

import java.util.Arrays;

public class SecondMinMaxFinder {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,12};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // this logic is for Min and Max
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        // This logic is for second min and max
        for(int num : arr) {
            if(num < min) {
                secondMin = min;
                min = num;
            }
            else if(num > min && num < secondMin) {
                secondMin = num;
            }
            if(num > max) {
                secondMax = max;
                max = num;
            }
            else if(num < max && num > secondMax) {
                secondMax = num;
            }
        }
        System.out.println("secondMin: " + secondMin);
        System.out.println("secondMax: " + secondMax);
    }
}

/**
 * O/p
 * min: 1
 * max: 12
 * secondMin: 2
 * secondMax: 9
 */