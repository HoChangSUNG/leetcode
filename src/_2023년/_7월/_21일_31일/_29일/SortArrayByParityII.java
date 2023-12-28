package _2023년._7월._21일_31일._29일;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0 && nums[i] % 2 == 0) continue;
            if (i % 2 != 0 && nums[i] % 2 != 0) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (i % 2 == 0) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                } else {
                    if (nums[j] % 2 != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
