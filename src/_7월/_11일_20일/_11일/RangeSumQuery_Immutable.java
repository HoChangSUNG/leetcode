package _7월._11일_20일._11일;

public class RangeSumQuery_Immutable {
    private int[] prefix;

    public RangeSumQuery_Immutable(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        return prefix[right + 1] - prefix[left];
    }
}
