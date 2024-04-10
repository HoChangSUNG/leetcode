package _2024년._4월._1일_10일._10일;

public class LargestSubarrayLengthK {
    public int[] largestSubarray(int[] nums, int k) {
        int startIndex = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            if (nums[startIndex] < nums[i]) startIndex = i;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[i + startIndex];
        }
        return result;
    }
}
