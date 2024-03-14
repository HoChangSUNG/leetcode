package _2024년._3월._11일_20일._14일;

import java.util.Arrays;
import java.util.Comparator;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0 && nums[i] < 0; i++, k--) {
            nums[i] = -nums[i];
        }
        int min = Integer.MAX_VALUE;
        for (int a : nums) {
            result += a;
            min = Math.min(min, a);
        }
        return result - (k % 2) * min * 2;
    }
}
