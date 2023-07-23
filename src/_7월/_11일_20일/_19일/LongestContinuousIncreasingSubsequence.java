package _7월._11일_20일._19일;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) temp++;
            else {
                if (result < temp) result = temp;
                temp = 1;
            }
        }

        if (result < temp) result = temp;
        return result;
    }
}
