package _2023년._9월._21일_30일._24일;

public class SurfaceAreaOf3DShapes {

    public int surfaceArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    result += (grid[i][j] * 4 + 2);
                    if (j != grid[0].length - 1) result -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
                    if (i != grid.length - 1) result -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
                }
            }
        }
        return result;
    }
}
