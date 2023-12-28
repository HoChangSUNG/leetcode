package _2023년._9월._21일_30일._25일;

public class SmallestRangeI {

    public int smallestRangeI(int[] nums, int k) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[min] > nums[i]) min = i;
            if (nums[max] < nums[i]) max = i;
        }
        int diff = nums[max] - nums[min] - 2 * k;
        return diff <= 0 ? 0 : diff;
    }
}
