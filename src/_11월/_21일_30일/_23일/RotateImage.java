package _11월._21일_30일._23일;


public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(i, j, j, i, matrix);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(i, j, i, n - j - 1, matrix);
            }
        }
    }

    private void swap(int si, int sj, int ei, int ej, int[][] matrix) {
        int temp = matrix[si][sj];
        matrix[si][sj] = matrix[ei][ej];
        matrix[ei][ej] = temp;
    }
}
