package _12월._1일_10일._3일;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        swap(nums, 0, nums.length - 1 - k);
        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - 1);

    }

    private void swap(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        for (int i = 0; i <= mid - start; i++) {
            int temp = nums[start + i];
            nums[start + i] = nums[end - i];
            nums[end - i] = temp;
        }
    }
}
