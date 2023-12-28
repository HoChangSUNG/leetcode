package _2023년._9월._21일_30일._22일;

public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double result = 0;
        int n = points.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    result = Math.max(result, 0.5 * Math.abs(points[i][1] * points[k][0] + points[j][1] * points[i][0] + points[j][0] * points[k][1] - (points[i][1] * points[j][0] + points[i][0] * points[k][1] + points[j][1] * points[k][0])));
                }
            }
        }
        return result;
    }
}
