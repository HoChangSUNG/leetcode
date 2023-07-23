package _7월._11일_20일._12일;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int result = nums[n - 1];
        for (int i = n - 1; i > -1; i--) {
            if (nums[i] < result) {
                count++;
                result = nums[i];
            }
            if (count == 3) break;
        }
        return count == 3 ? result : nums[n - 1];
    }
}
