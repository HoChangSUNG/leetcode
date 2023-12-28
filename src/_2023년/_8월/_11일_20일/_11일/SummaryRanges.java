package _2023년._8월._11일_20일._11일;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) end++;
            else {
                result.add(addElement(start, end));
                start = nums[i];
                end = nums[i];
            }
        }
        result.add(addElement(start, end));
        return result;

    }

    private String addElement(int start, int end) {
        StringBuilder sb = new StringBuilder();
        if (start == end) return sb.append(start).toString();
        else return sb.append(start).append("->").append(end).toString();
    }
}
