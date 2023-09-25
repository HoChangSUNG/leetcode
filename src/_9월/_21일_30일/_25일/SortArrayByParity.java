package _9월._21일_30일._25일;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx++] = temp;
            }
        }
        return nums;
    }
}
