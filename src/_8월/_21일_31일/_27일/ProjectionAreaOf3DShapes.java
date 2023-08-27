package _8월._21일_31일._27일;

public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {
        int[] yz = new int[grid.length];
        int[] zx = new int[grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                yz[i] = Math.max(yz[i], grid[i][j]);
                zx[j] = Math.max(zx[j], grid[i][j]);
                if (grid[i][j] != 0) res += 1;
            }
        }
        for (int i = 0; i < yz.length; i++) {
            res += (yz[i] + zx[i]);
        }

        return res;
    }
}
