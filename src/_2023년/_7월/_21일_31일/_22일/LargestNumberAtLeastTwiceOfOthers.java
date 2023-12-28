package _2023년._7월._21일_31일._22일;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int first = 0;
        int second = 1;
        if (nums[0] < nums[1]) {
            first = 1;
            second = 0;
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[second]) {
                if (nums[i] < nums[first]) second = i;
                else if (nums[i] >= nums[first]) {
                    second = first;
                    first = i;
                }
            }
        }

        return nums[first] >= nums[second] * 2 ? first : -1;
    }
}
