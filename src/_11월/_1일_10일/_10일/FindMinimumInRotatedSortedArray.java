package _11월._1일_10일._10일;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[left] <= nums[mid] && nums[mid] <= nums[right]) {
                right = mid - 1;
            } else if (nums[right] < nums[mid]) {
                left = mid + 1;
            } else if (nums[left] > nums[mid]) {
                right = mid;
            }
        }
        return nums[left];
    }
}
