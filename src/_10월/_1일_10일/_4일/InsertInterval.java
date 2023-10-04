package _10월._1일_10일._4일;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length+1][2];
        Arrays.sort(newIntervals, (o1, o2) -> o1[0]-o2[0]);

        List<int[]> result = new LinkedList<>();
        for(int i = 0;i<newIntervals.length;i++){
            if (result.isEmpty() || result.get(result.size() - 1)[1] < newIntervals[i][0]) {
                result.add(newIntervals[i]);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1],newIntervals[i][1]);
            }
        }
       return result.toArray(new int[result.size()][]);
    }
}
