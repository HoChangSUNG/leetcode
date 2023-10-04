package _10월._1일_10일._4일;

public class SpiralMatrixII {

    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};

    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int r = 0;
        int c = 0;
        int dir = 0;
        for (int i = 1; i <= n * n; i++) {
            arr[r][c] = i;
            int nextR = r + dr[dir];
            int nextC = c + dc[dir];
            if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || arr[nextR][nextC] > 0) {
                dir = (dir + 1) % 4;
                nextR = r + dr[dir];
                nextC = c + dc[dir];
            }
            r = nextR;
            c = nextC;
        }
        return arr;
    }
}
