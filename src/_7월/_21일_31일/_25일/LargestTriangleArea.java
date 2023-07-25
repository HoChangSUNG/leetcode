package _7월._21일_31일._25일;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double result = 0;
        for (int[] i : points) {
            for (int[] j : points) {
                for (int[] k : points) {
                    result = Math.max(result, 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
                }
            }
        }
        return result;
    }
}
