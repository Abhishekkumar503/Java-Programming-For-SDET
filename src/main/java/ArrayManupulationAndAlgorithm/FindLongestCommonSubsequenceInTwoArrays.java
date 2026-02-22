package ArrayManupulationAndAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLongestCommonSubsequenceInTwoArrays {
    public static void main(String[] args) {
        /**
         * This is solved by bottom up approach
         * You have : 1 3 4 5 6 7
         * Your friend : 3 5 6 8
         * 3 5 6 so the LCS
         * Length is 3
         */

        int[] nums1 = {1,5,7};
        int[] nums2 = {2,3,4,6,8};
        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    // We found a match!
                    // The current match contributes +1 to LCS length
                    // Plus whatever LCS we had before this match
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    //         ↑   ↑
                    //         |   Previous LCS (before current match)
                    //         Current match adds 1 to length
                } else {
                    // No match, take the best from either:
                    // - Excluding current element from arr1
                    // - Excluding current element from arr2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
