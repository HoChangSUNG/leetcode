package _2023년._10월._1일_10일._3일;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    int[] r = {0, 1, 0, -1};
    int[] c = {1, 0, -1, 0};

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] visited = new boolean[n][m];

        int i = 0;
        int j = 0;
        int dir = 0;
        for (int count = 0; count < n * m; count++) {
            result.add(matrix[i][j]);
            visited[i][j] = true;
            int nextI = i + r[dir];
            int nextJ = j + c[dir];
            if (nextI < 0 || nextI > n - 1 || nextJ < 0 || nextJ > m - 1 || visited[nextI][nextJ]) {
                dir = (dir + 1) % 4;
                nextI = i + r[dir];
                nextJ = j + c[dir];
            }
            i = nextI;
            j = nextJ;
        }
        return result;
    }
}
