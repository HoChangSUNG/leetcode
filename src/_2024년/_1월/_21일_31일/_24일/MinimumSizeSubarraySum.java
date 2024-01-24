package _2024년._1월._21일_31일._24일;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int i = 0;
        int j = 1;
        int result = Integer.MAX_VALUE;
        while (i <= n && j <= n) {
            int cur = sum[j] - sum[i];
            if (cur >= target) {
                result = Math.min(result, j - i);
                i++;
            } else {
                j++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
