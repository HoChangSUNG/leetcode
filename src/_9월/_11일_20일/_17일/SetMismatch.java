package _9월._11일_20일._17일;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int value = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (set.contains(nums[i])) value = nums[i];
            set.add(nums[i]);
        }
        return new int[]{
                value, nums.length * (nums.length + 1) / 2 - sum + value
        };
    }
}
