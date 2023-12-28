package _2023년._8월._21일_31일._28일;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        boolean isIncrease = true;
        boolean isDecrease = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] < 0) isIncrease = false;
            if (nums[i] - nums[i - 1] > 0) isDecrease = false;
        }

        return isIncrease || isDecrease;
    }
}
