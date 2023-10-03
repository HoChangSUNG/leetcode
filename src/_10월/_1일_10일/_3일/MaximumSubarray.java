package _10월._1일_10일._3일;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur + nums[i] < nums[i]) cur = nums[i];
            else cur += nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }
}
