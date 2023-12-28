package _2023년._10월._1일_10일._6일;

public class SortColors {

    public void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                } else break;
            }
        }
    }
}
