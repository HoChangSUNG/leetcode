package _2024년._1월._21일_31일._29일;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points){
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int count = 0;
        int start = points[0][0];
        int end = points[0][1];
        for(int i = 1;i< points.length;i++){
            if(end<points[i][0]){
                count++;
                start = points[i][0];
                end = points[i][1];
            }else{
                start = Math.max(start,points[i][0]);
                end = Math.min(end,points[i][1]);
            }
        }
        count++;
        return count;
    }
}
