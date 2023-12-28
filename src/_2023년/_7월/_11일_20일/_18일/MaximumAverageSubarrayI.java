package _2023년._7월._11일_20일._18일;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] += (sum[i] + nums[i]);
        }
        int result = Integer.MIN_VALUE;

        for (int i = 1; i + k <= sum.length; i++) {
            int temp = sum[i + k - 1] - sum[i - 1];
            if (result < temp) result = temp;
        }

        return result / (double) k;
    }
}
