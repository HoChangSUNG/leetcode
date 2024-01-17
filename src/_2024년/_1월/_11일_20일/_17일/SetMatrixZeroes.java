package _2024년._1월._11일_20일._17일;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] vertical = new boolean[n];
        boolean[] horizon = new boolean[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    vertical[j] = true;
                    horizon[i] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vertical[j] || horizon[i]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
