package _2024년._3월._1일_10일._2일;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) return nums[i];
        }
        return nums[0];
    }
}
