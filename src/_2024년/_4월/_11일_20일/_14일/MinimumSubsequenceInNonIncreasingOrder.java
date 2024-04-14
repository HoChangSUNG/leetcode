package _2024년._4월._11일_20일._14일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[] sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        int index = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (sum[i + 1] < sum[nums.length] - sum[i + 1]) {
                index = i;
            }
        }
        return getSubsequence(nums, index);
    }

    private List<Integer> getSubsequence(int[] nums, int index) {
        int size = nums.length - index - 1;
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length - 1; i > index; i--) {
            result.add(nums[i]);
        }
        return result;
    }
}
