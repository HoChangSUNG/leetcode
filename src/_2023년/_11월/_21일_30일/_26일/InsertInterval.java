package _2023년._11월._21일_30일._26일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        boolean isInserted = false;
        for (int i = 0; i < intervals.length; i++) {
            if (list.get(i)[0] > newInterval[0]) {
                list.add(i, newInterval);
                isInserted = true;
                break;
            }
        }
        if (!isInserted) {
            list.add(newInterval);
        }

        int start = list.get(0)[0];
        int end = list.get(0)[1];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (end < list.get(i)[0]) {
                result.add(new int[]{start, end});
                start = list.get(i)[0];
                end = list.get(i)[1];
            } else {
                end = Math.max(end, list.get(i)[1]);
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][0]);
    }
}
