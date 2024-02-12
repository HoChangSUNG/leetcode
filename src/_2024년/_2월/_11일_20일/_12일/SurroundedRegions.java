package _2024년._2월._11일_20일._12일;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    if (board[i][j] == 'O') {
                        queue.add(new Integer[]{i, j});
                        visited[i][j] = true;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nextR = cur[0] + dr[d];
                int nextC = cur[1] + dc[d];
                if (-1 < nextR && nextR < m && -1 < nextC && nextC < n) {
                    if (!visited[nextR][nextC] && board[nextR][nextC] == 'O') {
                        queue.add(new Integer[]{nextR, nextC});
                        visited[nextR][nextC] = true;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
