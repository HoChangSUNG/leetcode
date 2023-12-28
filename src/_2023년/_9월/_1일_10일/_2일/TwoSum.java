package _2023년._9월._1일_10일._2일;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) right--;
            else if (sum < target) left++;
            else {
                left = nums[left];
                right = nums[right];
                break;
            }
        }
        int[] res = new int[2];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == left || arr[i] == right) {
                res[idx++] = i;
            }
        }
        return res;
    }
}
