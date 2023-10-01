package _10월._1일_10일._1일;

public class JumpGameII {

    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = n - 1;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= i + nums[i] && j < n; j++) {
                dp[j] = Math.min(dp[i] + 1, dp[j]);
            }
        }
        return dp[n - 1];
    }
}
