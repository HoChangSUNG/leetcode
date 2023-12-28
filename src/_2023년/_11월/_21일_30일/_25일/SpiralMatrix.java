package _2023년._11월._21일_30일._25일;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    int[] dr = new int[]{0, 1, 0, -1};
    int[] dc = new int[]{1, 0, -1, 0};

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int r = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < m * n; i++) {
            result.add(matrix[r][c]);
            matrix[r][c] = -200;
            int nextR = r + dr[d];
            int nextC = c + dc[d];
            if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || matrix[nextR][nextC] == -200) {
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
