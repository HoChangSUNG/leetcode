package _7월._1일_10일._8일;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int init = 0;
        for (int i = 0; i < nums.length; i++) {
            init ^= nums[i];
        }
        return init;
    }
}
