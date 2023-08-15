package _8월._11일_20일._15일;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) temp++;
            else {
                if (max < temp) max = temp;
                temp = 0;
            }
        }
        return Math.max(max, temp);
    }
}
