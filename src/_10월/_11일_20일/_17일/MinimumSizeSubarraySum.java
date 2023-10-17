package _10월._11일_20일._17일;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        if (sum[n] < target) return 0;

        int i = 0;
        int j = 1;
        int result = n;
        while (i < j && i < n + 1 && j < n + 1) {
            int cur = sum[j] - sum[i];
            if (cur >= target) {
                result = Math.min(j - i, result);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
