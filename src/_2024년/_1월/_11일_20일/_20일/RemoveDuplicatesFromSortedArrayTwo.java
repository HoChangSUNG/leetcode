package _2024년._1월._11일_20일._20일;

public class RemoveDuplicatesFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int target = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                target = nums[i];
                count = 0;
            }
            if (count < 2) {
                nums[idx++] = target;
                count++;
            }
        }
        return idx;
    }
}
