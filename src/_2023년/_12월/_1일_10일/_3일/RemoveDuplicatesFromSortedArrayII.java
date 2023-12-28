package _2023년._12월._1일_10일._3일;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int target = nums[0];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target != nums[i]) {
                count = 0;
                target = nums[i];
            }
            if (count < 2) {
                nums[idx++] = nums[i];
                count++;
            }
        }
        return idx;
    }
}
