package _2023년._9월._11일_20일._14일;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = new int[n];
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = score[i];
        }
        Arrays.sort(sorted);
        Map<Integer, String> convert = new HashMap<>();
        for (int i = 0; i < n; i++) {

        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                convert.put(sorted[i], "Gold Medal");
            } else if (i == n - 2) {
                convert.put(sorted[i], "Silver Medal");
            } else if (i == n - 3) {
                convert.put(sorted[i], "Bronze Medal");
            } else {
                convert.put(sorted[i], String.valueOf(n - i));
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = convert.get(score[i]);
        }
        return result;
    }
}
