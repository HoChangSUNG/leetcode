package _2023년._10월._1일_10일._5일;

public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] paths = new int[n][m];
        if (obstacleGrid[0][0] == 0) paths[0][0] = 1;

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[i][0] == 0) paths[i][0] = paths[i - 1][0];
        }
        for (int j = 1; j < m; j++) {
            if (obstacleGrid[0][j] == 0) paths[0][j] = paths[0][j - 1];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 0) paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                else paths[i][j] = 0;
            }
        }

        return paths[n - 1][m - 1];
    }
}
