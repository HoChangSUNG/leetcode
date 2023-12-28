package _2023년._8월._11일_20일._19일;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        int cur = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                cur += nums[i] - nums[i - k];
                result = Math.max(result, cur);

            } else {
                cur += nums[i];
                if (i == k - 1) result = cur;
            }
        }

        return (result) / (double) k;
    }
}
