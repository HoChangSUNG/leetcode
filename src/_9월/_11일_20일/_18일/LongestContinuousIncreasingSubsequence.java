package _9월._11일_20일._18일;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
                result = Math.max(count, result);
            } else count = 1;
        }
        return result;
    }
}
