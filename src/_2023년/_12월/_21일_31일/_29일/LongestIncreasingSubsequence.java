package _2023년._12월._21일_31일._29일;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > sequence.get(sequence.size() - 1)) sequence.add(num);
            else {
                int j = binarySearch(sequence, num);
                sequence.set(j, num);
            }
        }
        return sequence.size();
    }

    private int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (sub.get(mid) == num) return mid;
            if (sub.get(mid) < num) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
