package _2023년._8월._21일_31일._24일;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] window = window = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (window[j - 1] != matrix[i][j]) return false;
            }
            window = matrix[i];
        }
        return true;
    }
}
