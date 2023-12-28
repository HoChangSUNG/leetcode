package _2023년._10월._1일_10일._9일;

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int index = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) index++;
                count++;
            } else {
                count = 1;
                index++;
            }
            nums[index] = nums[i];
        }
        return index + 1;
    }
}
