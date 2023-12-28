package _2023년._9월._11일_20일._13일;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) cnt++;
            else cnt = 0;
            result = Math.max(result, cnt);
        }

        return result;
    }
}
