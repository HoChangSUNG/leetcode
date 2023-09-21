package _9월._21일_30일._21일;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] slide = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (slide[j - 1] != matrix[i][j]) return false;
            }
            slide = matrix[i];
        }
        return true;
    }
}
