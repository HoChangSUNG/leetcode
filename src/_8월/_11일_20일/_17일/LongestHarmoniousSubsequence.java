package _8월._11일_20일._17일;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        int lhs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            int max = Math.max(map.getOrDefault(nums[i] - 1, 0), map.getOrDefault(nums[i] + 1, 0));
            if (max == 0) continue;
            lhs = Math.max(max + map.get(nums[i]), lhs);
        }
        return lhs;
    }
}
