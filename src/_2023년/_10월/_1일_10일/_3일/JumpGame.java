package _2023년._10월._1일_10일._3일;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (i > max) break;
            max = Math.max(i + nums[i], max);
        }
        return max >= n - 1 ? true : false;
    }
}
