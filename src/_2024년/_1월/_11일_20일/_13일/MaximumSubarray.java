package _2024년._1월._11일_20일._13일;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) sum = nums[i];
            result = Math.max(sum, result);
        }
        return result;
    }
}
