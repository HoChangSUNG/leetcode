package _12월._1일_10일._4일;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int result = n;
        if (sum[n] < target) return 0;
        int i = 0;
        int j = 1;
        while (i <= n && j <= n) {
            if (sum[j] - sum[i] >= target) {
                result = Math.min(j - i, result);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
