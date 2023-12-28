package _2023년._11월._21일_30일._28일;

import java.util.ArrayList;

public class SetMatrixZeroes {
    int[] dr = new int[]{0, 1, 0, -1};
    int[] dc = new int[]{1, 0, -1, 0};

    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int d = 0; d < 4; d++) {
                toZero(list.get(i)[0], list.get(i)[1], d, matrix);
            }
        }
    }

    public void toZero(int i, int j, int d, int[][] matrix) {
        while (-1 < i && i < matrix.length && -1 < j && j < matrix[0].length) {
            matrix[i][j] = 0;
            i += dr[d];
            j += dc[d];
        }
    }
}
