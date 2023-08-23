package _8월._21일_31일._23일;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (idx != i) {
                if (nums[i] * 2 > max) return -1;
            }
        }
        return idx;
    }
}
