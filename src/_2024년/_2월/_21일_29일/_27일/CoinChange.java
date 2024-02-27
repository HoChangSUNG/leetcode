package _2024년._2월._21일_29일._27일;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                int preIndex = i - coin;
                if (preIndex < 0 || dp[preIndex] == -1) continue;
                if (dp[i] == -1) {
                    dp[i] = dp[preIndex] + 1;
                } else {
                    dp[i] = Math.min(dp[i], dp[preIndex] + 1);
                }
            }
        }
        return dp[amount];
    }
}
