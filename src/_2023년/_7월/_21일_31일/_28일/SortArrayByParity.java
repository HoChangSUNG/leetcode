package _2023년._7월._21일_31일._28일;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((nums[j] & 1) == 0 && (nums[j - 1] & 1) == 1) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
