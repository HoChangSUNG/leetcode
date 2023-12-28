package _2023년._7월._21일_31일._26일;

public class ProjectionAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xy = 0;
        int[] xz = new int[n]; //row 큰값 배열
        int[] yz = new int[n]; // col 큰값 배열

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (xz[i] < grid[i][j]) xz[i] = grid[i][j];
                if (yz[j] < grid[i][j]) yz[j] = grid[i][j];
                if (grid[i][j] > 0) xy++;
            }
        }
        for (int i = 0; i < n; i++) {
            xy = xz[i] + yz[i] + xy;
        }
        return xy;
    }
}
