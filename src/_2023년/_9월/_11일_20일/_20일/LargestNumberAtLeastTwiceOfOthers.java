package _2023년._9월._11일_20일._20일;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int first = 0;
        int second = 1;
        if (nums[first] < nums[second]) {
            first = 1;
            second = 0;
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[first] < nums[i]) {
                second = first;
                first = i;
            } else if (nums[second] < nums[i]) {
                second = i;
            }
        }
        return nums[first] >= nums[second] * 2 ? first : -1;
    }
}
