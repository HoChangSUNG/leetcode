package _12월._21일_31일._25일;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Pair[] cells = new Pair[n * n + 1];
        int labels = 1;
        Integer[] columns = new Integer[n];
        for (int i = 0; i < n; i++) {
            columns[i] = i;
        }
        for (int row = n - 1; row >= 0; row--) {
            for (int col : columns) {
                cells[labels++] = new Pair(row, col);
            }
            Collections.reverse(Arrays.asList(columns));
        }
        int[] dist = new int[n * n + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();
        dist[1] = 0;
        queue.add(1);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next = curr + 1; next <= Math.min(curr + 6, n * n); next++) {
                int row = cells[next].key;
                int col = cells[next].value;
                int destination = board[row][col] == -1 ? next : board[row][col];
                if (dist[destination] == -1) {
                    dist[destination] = dist[curr] + 1;
                    queue.add(destination);
                }

            }
        }
        return dist[n * n];

    }

    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
