package _12월._21일_31일._29일;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] cur = new int[triangle.size()];
        cur[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            cur[i] = cur[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; j--) {
                cur[j] = Math.min(cur[j], cur[j - 1]) + triangle.get(i).get(j);
            }
            cur[0] = cur[0] + triangle.get(i).get(0);
        }

        int result = cur[0];
        for (int element : cur) {
            result = Math.min(result, element);
        }
        return result;
    }
}
