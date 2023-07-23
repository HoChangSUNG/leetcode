package _7월._11일_20일._18일;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] rep = new int[nums.length];
        int dup = 0;
        int mis = 0;
        for (int i = 0; i < nums.length; i++) {
            if (rep[nums[i] - 1] == 1) {
                dup = nums[i];
                continue;
            }
            rep[nums[i] - 1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (rep[i] == 0) {
                mis = i + 1;
                break;
            }
        }
        int[] result = {dup, mis};
        return result;
    }
}
