package _2023년._7월._11일_20일._20일;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Node> q = new LinkedList();
        boolean[][] visited = new boolean[image.length][image[0].length];
        visited[sr][sc] = true;
        q.add(new Node(sr, sc));
        int original = image[sr][sc];
        image[sr][sc] = color;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextR = cur.r + dr[i];
                int nextC = cur.c + dc[i];

                if (nextR < 0 || nextR >= image.length || nextC < 0 || nextC >= image[0].length) continue;
                if (image[nextR][nextC] != original || visited[nextR][nextC]) continue;
                image[nextR][nextC] = color;
                visited[nextR][nextC] = true;
                q.add(new Node(nextR, nextC));
            }
        }
        return image;
    }

    static class Node {
        int r;
        int c;

        Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
