package _11월._21일_30일._22일;

import java.util.Arrays;

public class JumpGameII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j >= nums.length) break;
                if (dp[i + j] == -1) dp[i + j] = dp[i] + 1;
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[nums.length - 1];
    }
}
