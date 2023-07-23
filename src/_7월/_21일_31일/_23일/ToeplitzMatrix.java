package _7월._21일_31일._23일;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] temp = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int[] temp2 = new int[matrix[0].length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != 0) {
                    if (j > 0 && temp[j - 1] != matrix[i][j]) {
                        return false;
                    }
                }
                temp2[j] = matrix[i][j];
            }
            temp = temp2;
        }
        return true;
    }
}
