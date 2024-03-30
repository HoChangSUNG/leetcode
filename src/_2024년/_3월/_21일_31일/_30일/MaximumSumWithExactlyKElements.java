package _2024년._3월._21일_31일._30일;

public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        int cur = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > cur) cur = nums[i];
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += cur;
            cur++;
        }
        return result;
    }
}
