package _2023년._8월._1일_10일._3일;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[idx++] = nums[i];
        }
        return idx;
    }
}
