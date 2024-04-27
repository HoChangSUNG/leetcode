package _2024년._4월;

public class MatrixSquare {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0] - '0';
            result = Math.max(dp[i][0], result);
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j] - '0';
            result = Math.max(dp[0][j], result);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] - '0' == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    result = Math.max(dp[i][j], result);

                }
            }
        }
        return result * result;
    }
}
