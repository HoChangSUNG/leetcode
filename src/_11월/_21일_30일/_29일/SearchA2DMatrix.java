package _11월._21일_30일._29일;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n * m - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[mid / m][mid % m] == target) return true;
            else if (matrix[mid / m][mid % m] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
