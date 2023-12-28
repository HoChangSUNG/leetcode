package _2023년._8월._11일_20일._12일;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[idx];
                nums[idx++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
