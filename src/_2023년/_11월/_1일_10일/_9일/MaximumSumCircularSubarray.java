package _2023년._11월._1일_10일._9일;

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];
        int suffixSum = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum += nums[i];
            rightMax[i] = Math.max(rightMax[i + 1], suffixSum);
        }

        int maxSum = nums[0];
        int special = nums[0];
        int cur = 0;
        for (int i = 0, prefixSum = 0; i < n; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            maxSum = Math.max(cur, maxSum);

            prefixSum += nums[i];
            if (i + 1 < n) {
                special = Math.max(special, prefixSum + rightMax[i + 1]);
            }
        }
        return Math.max(maxSum, special);
    }
}