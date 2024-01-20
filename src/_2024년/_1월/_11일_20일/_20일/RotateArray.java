package _2024년._1월._11일_20일._20일;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        swap(0, n - k - 1, nums);
        swap(n - k, n - 1, nums);
        swap(0, n - 1, nums);
    }

    private void swap(int start, int end, int[] nums) {
        int mid = (start + end) / 2;
        int j = 0;
        for (int i = start; i <= mid; i++) {
            int temp = nums[i];
            nums[i] = nums[end - j];
            nums[end - j] = temp;
            j++;
        }
    }
}
