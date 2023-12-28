package _2023년._8월._11일_20일._12일;

public class RangeSumQuery_Immutable {

    private int[] sumArr;

    public RangeSumQuery_Immutable(int[] nums) {
        sumArr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sumArr[i + 1] = nums[i] + sumArr[i];
        }
    }

    public int sumRange(int left, int right) {
        return sumArr[right + 1] - sumArr[left];
    }
}
