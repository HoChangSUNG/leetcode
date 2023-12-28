package _2023년._7월._21일_31일._31일;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int idx = nums.length - 1;

        int[] result = new int[nums.length];
        while (i <= j) {
            if ((nums[i] * nums[i]) > (nums[j] * nums[j])) {
                result[idx] = nums[i] * nums[i];
                i++;
            } else {
                result[idx] = nums[j] * nums[j];
                j--;
            }
            idx--;
        }
        return result;
    }
}
