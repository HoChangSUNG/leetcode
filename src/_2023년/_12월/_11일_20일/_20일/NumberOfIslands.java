package _2023년._12월._11일_20일._20일;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    private int[] dr = new int[]{-1, 0, 1, 0};
    private int[] dc = new int[]{0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    findIsland(grid, visited, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    void findIsland(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nextR = cur[0] + dr[d];
                int nextC = cur[1] + dc[d];
                if (-1 < nextR && nextR < grid.length && -1 < nextC && nextC < grid[0].length && !visited[nextR][nextC] && grid[nextR][nextC] == '1') {
                    visited[nextR][nextC] = true;
                    queue.add(new Integer[]{nextR, nextC});
                }
            }
        }
    }

}
