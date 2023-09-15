package _9월._11일_20일._15일;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (n * m != r * c) return mat;

        int[][] result = new int[r][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int idx = i * m + j;
                result[idx / c][idx % c] = mat[i][j];
            }
        }
        return result;
    }
}
