package _2023년._9월._21일_30일._27일;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;
        while (left <= right) {
            int leftValue = nums[left] * nums[left];
            int rightValue = nums[right] * nums[right];
            if (leftValue < rightValue) {
                result[idx--] = rightValue;
                right--;
            } else {
                result[idx--] = leftValue;
                left++;
            }
        }
        return result;
    }
}
