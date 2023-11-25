package _11월._21일_30일._25일;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int furtherEnd = 0;
        int further = nums[0];
        for (int i = 0; i < nums.length; i++) {
            further = Math.max(further, i + nums[i]);
            if (furtherEnd >= nums.length - 1) return true;
            if (i == furtherEnd) {
                if (furtherEnd >= further) return false;
                furtherEnd = further;
                further = i;
            }
        }
        return true;
    }
}
