package _9월._21일_30일._28일;

import java.util.Arrays;

public class _3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < n && diff != 0; i++) {
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (Math.abs(diff) > Math.abs(target - sum)) {
                    diff = target - sum;
                }
                if (sum < target) low++;
                else high--;
            }
        }
        return target - diff;
    }
}
