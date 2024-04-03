package _2024년._4월._1일_10일._3일;

public class TwoFurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int diff = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[i] != colors[j]) {
                    diff = Math.max(diff, j - i);
                }
            }
        }
        return diff;
    }
}
