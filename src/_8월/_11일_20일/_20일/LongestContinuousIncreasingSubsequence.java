package _8월._11일_20일._20일;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int cur = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (max < ++cur) max = cur;
            } else cur = 1;
        }
        return max;
    }
}
