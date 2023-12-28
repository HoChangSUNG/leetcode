package _2023년._11월._11일_20일._16일;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int lis = 1;
        Arrays.fill(dp, 1);
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    lis = Math.max(dp[i], lis);
                }
            }
        }
        return lis;
    }
}
