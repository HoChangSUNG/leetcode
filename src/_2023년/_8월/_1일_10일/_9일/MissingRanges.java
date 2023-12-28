package _2023년._8월._1일_10일._9일;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (lower < nums[i]) add(result, lower, nums[i] - 1);
            lower = nums[i] + 1;
        }

        if (lower <= upper) add(result, lower, upper);
        return result;
    }

    private void add(List<List<Integer>> result, int start, int end) {
        List<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        result.add(temp);
    }
}
