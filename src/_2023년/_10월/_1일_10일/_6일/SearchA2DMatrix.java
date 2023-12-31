package _2023년._10월._1일_10일._6일;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n * m - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int i = mid / m;
            int j = mid % m;
            if (matrix[i][j] < target) left = mid + 1;
            else if (matrix[i][j] > target) right = mid - 1;
            else return true;
        }
        return false;
    }
}
