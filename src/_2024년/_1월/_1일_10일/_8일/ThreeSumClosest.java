package _2024년._1월._1일_10일._8일;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int closest = nums[i] + search(nums, target - nums[i], i + 1);
            if (Math.abs(closest - target) < Math.abs(result - target)) result = closest;
        }
        return result;
    }

    private int search(int[] nums, int target, int j) {
        int left = j;
        int right = nums.length - 1;
        int result = nums[j] + nums[nums.length - 1];

        while (left < right) {
            int cur = nums[left] + nums[right];
            if (Math.abs(cur - target) < Math.abs(result - target)) result = cur;
            if (cur < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
