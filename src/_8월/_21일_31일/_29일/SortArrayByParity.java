package _8월._21일_31일._29일;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[idx];
                nums[idx++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
