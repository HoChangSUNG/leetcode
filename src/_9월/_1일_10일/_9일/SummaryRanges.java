package _9월._1일_10일._9일;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int left = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + 1) != nums[i + 1]) {
                result.add(toString(left, nums[i]));
                left = nums[i + 1];
            }
        }
        result.add(toString(left, nums[nums.length - 1]));
        return result;
    }

    public String toString(int start, int end) {
        StringBuilder sb = new StringBuilder();
        if (start == end) sb.append(start);
        else {
            sb.append(start).append("->").append(end);
        }
        return sb.toString();
    }
}
