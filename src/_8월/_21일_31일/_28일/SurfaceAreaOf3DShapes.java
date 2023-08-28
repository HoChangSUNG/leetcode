package _8월._21일_31일._28일;

public class SurfaceAreaOf3DShapes {

    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    int temp = 0;
                    temp += (grid[i][j] * 4 + 2);
                    if (i + 1 < grid.length) temp -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
                    if (j + 1 < grid[i].length) temp -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
                    sum += temp;
                }
            }
        }
        return sum;
    }
}
