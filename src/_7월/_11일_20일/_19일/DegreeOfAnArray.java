package _7월._11일_20일._19일;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int max = 1;
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!map.containsKey(a)) {
                map.put(a, new int[]{1, i});
            } else {
                int[] x = map.get(a);
                x[0]++;
                if (x[0] > max) {
                    max = x[0];
                    res = i - x[1] + 1;
                } else if (x[0] == max) {
                    res = Math.min(res, i - x[1] + 1);
                }

            }
        }
        return res;
    }
}
