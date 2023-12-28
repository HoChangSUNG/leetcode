package _2023년._12월._1일_10일._9일;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int start = points[0][0];
        int end = points[0][1];
        int count = 0;
        for (int i = 1; i < points.length; i++) {
            if (start <= points[i][0] && points[i][0] <= end) {
                start = points[i][0];
                end = Math.min(end, points[i][1]);
            } else {
                count++;
                start = points[i][0];
                end = points[i][1];
            }
        }
        count++;
        return count;
    }
}
