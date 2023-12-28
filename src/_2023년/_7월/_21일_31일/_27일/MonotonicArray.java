package _2023년._7월._21일_31일._27일;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) return true;
        boolean isAcending = true;
        boolean isDecending = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] - nums[i] > 0) {
                isAcending = false;
                break;
            }
        }
        if (isAcending) return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] - nums[i] < 0) {
                isDecending = false;
                break;
            }
        }
        return isDecending ? true : false;
    }
}
