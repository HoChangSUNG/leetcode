package _11월._11일_20일._16일;

import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] cur = new int[n];
        cur[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            cur[i] = cur[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; j--) {
                cur[j] = Math.min(cur[j], cur[j - 1]) + triangle.get(i).get(j);
            }
            cur[0] += triangle.get(i).get(0);
        }
        int result = cur[0];
        for (int i = 1; i < n; i++) {
            result = Math.min(result, cur[i]);
        }
        return result;
    }
}
