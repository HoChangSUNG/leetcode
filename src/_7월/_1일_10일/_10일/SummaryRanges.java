package _7월._1일_10일._10일;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int pre = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                add(pre, nums[i], result);
                pre = nums[i + 1];
            }
        }
        add(pre, nums[nums.length - 1], result);
        return result;
    }

    public void add(int start, int end, List<String> result) {
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        if (start != end) {
            sb.append("->").append(end);
        }
        result.add(sb.toString());
    }
}
