package _2023년._8월._11일_20일._19일;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int res = 0;
        int[] result = new int[2];
        int[] cnt = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res ^= (i + 1);
            if (cnt[nums[i] - 1] == 1) {
                result[0] = nums[i];
            } else {
                cnt[nums[i] - 1] = 1;
                res ^= nums[i];
            }
        }
        result[1] = res;
        return result;
    }
}
