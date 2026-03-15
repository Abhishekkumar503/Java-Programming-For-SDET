package SearchingAlgorithm;

public class MaxSumArray {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 3;
        System.out.println("Highest Sum of Kth length : " + maxSumArray(arr,k));
    }

    private static int maxSumArray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        int windowStart = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if(i >= k-1)
            {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart++];
            }
        }
        return maxSum;
    }
}

/**
 * O/p
 * Highest Sum of Kth length : 5
 */