package _11월._1일_10일._1일;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (board[i][j] == 'O') {
                    searchIsland(i, j, board);
                }

            }
        }
    }

    private void searchIsland(int r, int c, char[][] grid) {
        if (!isPossible(r, c, grid)) return;
        Queue<Integer[]> queue = new LinkedList<>();

        queue.add(new Integer[]{r, c});
        grid[r][c] = 'X';
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = cur[0] + dr[i];
                int nextCol = cur[1] + dc[i];
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || grid[nextRow][nextCol] == 'X') {
                    continue;
                }
                grid[nextRow][nextCol] = 'X';
                queue.add(new Integer[]{nextRow, nextCol});
            }
        }
    }

    private boolean isPossible(int r, int c, char[][] grid) {
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        queue.add(new Integer[]{r, c});
        visited[r][c] = true;
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = cur[0] + dr[i];
                int nextCol = cur[1] + dc[i];
                if (grid[nextRow][nextCol] == 'X' || visited[nextRow][nextCol]) continue;
                if (nextRow == 0 || nextRow == grid.length - 1 || nextCol == 0 || nextCol == grid[0].length - 1) {
                    return false;
                }
                queue.add(new Integer[]{nextRow, nextCol});
                visited[nextRow][nextCol] = true;
            }
        }
        return true;
    }
}
