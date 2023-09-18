package _9월._11일_20일._18일;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        int[] degree = new int[50000];
        Map<Integer, Integer> start = new HashMap<>();
        int result = 0;
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!start.containsKey(nums[i])) start.put(nums[i], i);
            degree[nums[i]] += 1;
            if (degree[nums[i]] > d) {
                d = degree[nums[i]];
                result = i - start.get(nums[i]) + 1;
            } else if (degree[nums[i]] == d) {
                result = Math.min(result, i - start.get(nums[i]) + 1);
            }
        }
        return result;
    }
}
