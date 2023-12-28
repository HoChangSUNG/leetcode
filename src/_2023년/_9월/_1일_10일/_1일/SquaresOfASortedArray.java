package _2023년._9월._1일_10일._1일;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int idx = right;
        int[] result = new int[nums.length];

        while (left <= right) {
            int l = Math.abs(nums[left]);
            int r = Math.abs(nums[right]);
            if (l >= r) {
                result[idx] = l * l;
                left++;
            } else {
                result[idx] = r * r;
                right--;
            }
            idx--;
        }
        return result;
    }
}
