package _2023년._7월._11일_20일._13일;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count = 0;
            else count++;
            if (result < count) result = count;
        }
        return result;
    }
}
