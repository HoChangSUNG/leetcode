package _2023년._12월._21일_31일._31일;

public class Robber {
    public int rob(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        dp[0] = nums[0];
        if (size > 1) {
            dp[1] = Math.max(nums[1], nums[0]);
        }

        for (int i = 2; i < size; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[size - 1];
    }
}
