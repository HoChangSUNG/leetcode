package _2023년._12월._11일_20일._13일;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[citations.length - 1 - i] > i) hIndex++;
        }
        return hIndex;
    }
}
