package _2023년._11월._21일_30일._27일;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        int[][] result = new int[n][n];
        int r = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= n * n; i++) {
            result[r][c] = i;
            int nextR = r + dr[d];
            int nextC = c + dc[d];
            if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || result[nextR][nextC] > 0) {
                d = (d + 1) % 4;
                nextR = r + dr[d];
                nextC = c + dc[d];
            }
            r = nextR;
            c = nextC;
        }
        return result;
    }
}
