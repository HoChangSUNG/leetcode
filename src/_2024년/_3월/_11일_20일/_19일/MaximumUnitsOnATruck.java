package _2024년._3월._11일_20일._19일;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        int result = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize <= 0) break;
            int unitSize = Math.min(truckSize, boxTypes[i][0]);
            result += (boxTypes[i][1] * unitSize);
            truckSize -= unitSize;
        }
        return result;
    }
}
