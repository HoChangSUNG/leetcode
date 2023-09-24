package _9월._21일_30일._24일;

public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {
        int result = 0;
        int[] r = new int[grid.length];
        int[] c = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                r[i] = Math.max(grid[i][j], r[i]);
                c[j] = Math.max(grid[i][j], c[j]);
                if (grid[i][j] > 0) result++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            result += (r[i] + c[i]);
        }
        return result;
    }
}
