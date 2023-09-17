package _9월._11일_20일._17일;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        long result = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) {
                sum -= nums[i - k];
            }
            if (i >= k - 1) {
                result = Math.max(sum, result);
            }
        }
        return (double) result / k;
    }
}
