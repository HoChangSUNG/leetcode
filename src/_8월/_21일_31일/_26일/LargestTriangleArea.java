package _8월._21일_31일._26일;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    max = Math.max(max, 0.5 * Math.abs((points[j][0] - points[i][0]) * (points[k][1] - points[j][1]) + (points[k][0] - points[j][0]) * (points[i][1] - points[k][1])
                            + (points[k][0] - points[j][0]) * (points[k][1] - points[j][1])));
                }
            }
        }
        return max;
    }
}
