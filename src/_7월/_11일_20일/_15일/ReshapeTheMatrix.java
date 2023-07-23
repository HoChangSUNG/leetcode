package _7월._11일_20일._15일;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) return mat;

        int[][] result = new int[r][c];
        int idx = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                result[idx / c][idx % c] = mat[i][j];
                idx++;
            }
        }
        return result;
    }
}
