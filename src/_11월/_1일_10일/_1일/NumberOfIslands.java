package _11월._1일_10일._1일;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    searchIsland(i, j, grid);
                }

            }
        }
        return count;
    }

    private void searchIsland(int r, int c, char[][] grid) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{r, c});
        grid[r][c] = '0';
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = cur[0] + dr[i];
                int nextCol = cur[1] + dc[i];
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || grid[nextRow][nextCol] == '0') {
                    continue;
                }
                grid[nextRow][nextCol] = '0';
                queue.add(new Integer[]{nextRow, nextCol});
            }
        }
    }
}
