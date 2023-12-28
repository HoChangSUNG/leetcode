package _2023년._7월._11일_20일._14일;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String arr[] = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
        }
        int idx = 0;
        while (!pq.isEmpty()) {
            if (idx == 0) map.put(pq.remove(), "Gold Medal");
            else if (idx == 1) map.put(pq.remove(), "Silver Medal");
            else if (idx == 2) map.put(pq.remove(), "Bronze Medal");
            else map.put(pq.remove(), String.valueOf(idx + 1));
            idx++;
        }
        for (int i = 0; i < score.length; i++) {
            arr[i] = map.get(score[i]);
        }
        return arr;
    }
}
