package _2024년._3월._21일_31일._25일;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count++;
                int substract = nums[i];
                for (int j = i; j < nums.length; j++) {
                    nums[j] -= substract;
                }
            }
        }
        return count;
    }
}
