package _9월._21일_30일._25일;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1;
        for (int i = 0; i < n; i += 2) {
            if (nums[i] % 2 != 0) {
                for (; j < n; j += 2) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
