package _2023년._7월._11일_20일._20일;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum[i] == sum[nums.length] - sum[i + 1]) return i;
        }
        return -1;
    }
}
