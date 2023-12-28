package _2023년._8월._11일_20일._17일;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int idx = i * c + j;
                result[i][j] = mat[idx / m][idx % m];
            }
        }
        return result;
    }
}
