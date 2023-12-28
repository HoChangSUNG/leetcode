package _2023년._12월._21일_31일._30일;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < amount; i++) {
            if (dp[i] == -1) continue;
            for (int dr : coins) {
                if (i > amount - dr) continue;
                if (dp[i + dr] == -1) dp[i + dr] = dp[i] + 1;
                else dp[i + dr] = Math.min(dp[i] + 1, dp[i + dr]);
            }
        }
        return dp[amount];
    }
}
