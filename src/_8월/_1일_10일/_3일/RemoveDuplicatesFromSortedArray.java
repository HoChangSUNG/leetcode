package _8월._1일_10일._3일;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[idx - 1] != nums[i]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
