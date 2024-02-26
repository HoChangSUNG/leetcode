package _2024년._2월._21일_29일._26일;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                else if (j == i) dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                else dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
        }

        int result = dp[m - 1][m - 1];
        for (int i = 0; i < m; i++) {
            result = Math.min(result, dp[m - 1][i]);
            System.out.println(dp[m - 1][i]);
        }
        return result;
    }
}