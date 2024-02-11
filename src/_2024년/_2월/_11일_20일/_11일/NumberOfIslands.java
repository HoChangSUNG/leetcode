package _2024년._2월._11일_20일._11일;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    searchIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void searchIsland(char[][] grid, int i, int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i, j});
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nextR = dr[d] + cur[0];
                int nextC = dc[d] + cur[1];
                if (-1 < nextR && nextR < grid.length && -1 < nextC && nextC < grid[0].length) {
                    if (grid[nextR][nextC] == '1') {
                        queue.add(new Integer[]{nextR, nextC});
                        grid[nextR][nextC] = '0';
                    }
                }
            }
        }
    }
}
