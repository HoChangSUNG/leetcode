package _2024년._2월._21일_29일._28일;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int lis = 1;
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    lis = Math.max(lis, dp[i]);
                }
            }
        }
        return lis;
    }
}
