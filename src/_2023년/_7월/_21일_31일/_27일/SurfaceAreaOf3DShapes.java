package _2023년._7월._21일_31일._27일;

public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) result += (4 * grid[i][j] + 2);
                if (i > 0) result -= (2 * Math.min(grid[i][j], grid[i - 1][j]));
                if (j > 0) result -= (2 * Math.min(grid[i][j], grid[i][j - 1]));
            }
        }
        return result;
    }
}
