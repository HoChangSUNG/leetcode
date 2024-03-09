package _2024년._3월._1일_10일._8일;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        for (int num1 : nums1) {
            pq.add(new Integer[]{num1 + nums2[0], 0});
        }

        while (k > 0 && !pq.isEmpty()) {
            Integer[] cur = pq.poll();
            int num2Index = cur[1];

            ArrayList<Integer> curPair = new ArrayList<>();
            curPair.add(cur[0] - nums2[num2Index]);
            curPair.add(nums2[num2Index]);

            result.add(curPair);

            if (num2Index + 1 < nums2.length) {
                pq.add(new Integer[]{cur[0] - nums2[num2Index] + nums2[num2Index + 1], num2Index + 1});
            }
            k--;
        }
        return result;
    }
}
