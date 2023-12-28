package _2023년._8월._21일_31일._29일;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }
        return max - min - 2 * k <= 0 ? 0 : max - min - 2 * k;
    }
}
