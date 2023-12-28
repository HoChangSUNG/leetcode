package _2023년._10월._11일_20일._11일;

import java.util.Arrays;

public class H_Index {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;
    }
}