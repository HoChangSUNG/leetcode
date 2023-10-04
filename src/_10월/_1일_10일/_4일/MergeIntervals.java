package _10월._1일_10일._4일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (end < intervals[i][0]) {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            } else if (end == intervals[i][0]) end = intervals[i][1];
            else {
                end = Math.max(end, intervals[i][1]);
            }
        }

        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}
