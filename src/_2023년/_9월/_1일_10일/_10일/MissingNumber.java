package _2023년._9월._1일_10일._10일;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
            result ^= (i + 1);
        }
        return result;
    }
}
