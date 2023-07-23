package _7월._1일_10일._9일;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        int next = lower;
        for (int i = 0; i < nums.length; i++) {
            // if(next>nums[i])continue;

            if (next == nums[i]) {
                next++;
                continue;
            }
            // next ~ nums[i]-1
            inputMissing(result, next, nums[i] - 1);
            next = nums[i] + 1;
        }
        if (next <= upper) {
            inputMissing(result, next, upper);
        }
        return result;
    }

    public void inputMissing(List<List<Integer>> result, int start, int end) {
        List<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        result.add(temp);
    }
}
