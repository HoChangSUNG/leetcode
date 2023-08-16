package _8월._11일_20일._16일;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int[] temp = new int[score.length];
        Map<Integer, String> map = new HashMap<>();
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            temp[i] = score[i];
        }
        Arrays.sort(temp);

        for (int i = n - 1; i > -1; i--) {
            int cur = temp[i];
            if (i == n - 1) map.put(cur, "Gold Medal");
            else if (i == n - 2) map.put(cur, "Silver Medal");
            else if (i == n - 3) map.put(cur, "Bronze Medal");
            else map.put(cur, String.valueOf(n - i));
        }
        String[] res = new String[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(score[i]);
        }
        return res;
    }
}
