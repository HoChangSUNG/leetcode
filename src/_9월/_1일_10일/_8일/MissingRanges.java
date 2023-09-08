package _9월._1일_10일._8일;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - lower > 0) add(lower, nums[i] - 1, result);
            lower = nums[i] + 1;
        }
        if (upper - lower >= 0) add(lower, upper, result);
        return result;
    }

    public void add(int lower, int upper, List<List<Integer>> result) {
        List<Integer> arr = new ArrayList<>();
        arr.add(lower);
        arr.add(upper);
        result.add(arr);
    }
}
