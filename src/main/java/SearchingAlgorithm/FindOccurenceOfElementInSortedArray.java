package SearchingAlgorithm;

import java.util.Arrays;

public class FindOccurenceOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {11, 2, 33, 4, 54, 65, 7, 86, 96};
        int target = 65;
        int result = findLastOccurence(arr,target);
        if (result == -1) {
            System.out.println("Target not found!!");
        }
        else {
            System.out.println("Last Occurrence of " + target + " is at index : " + result);
        }
    }

    private static int findLastOccurence(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                result =  mid;
                start = mid + 1;  // Continue searching RIGHT for last occurrence
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
}
