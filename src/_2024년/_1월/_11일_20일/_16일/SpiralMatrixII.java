package _2024년._1월._11일_20일._16일;

public class SpiralMatrixII {
    int[] dr = new int[]{0, 1, 0, -1};
    int[] dc = new int[]{1, 0, -1, 0};

    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int r = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= n * n; i++) {
            spiral[r][c] = i;
            int nextR = r + dr[d];
            int nextC = c + dc[d];
            if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || spiral[nextR][nextC] != 0) {
                d = (d + 1) % 4;
                nextR = r + dr[d];
                nextC = c + dc[d];
            }
            r = nextR;
            c = nextC;
        }
        return spiral;
    }
}
