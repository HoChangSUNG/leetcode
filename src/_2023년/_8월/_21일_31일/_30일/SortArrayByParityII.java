package _2023년._8월._21일_31일._30일;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1) j += 2;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
