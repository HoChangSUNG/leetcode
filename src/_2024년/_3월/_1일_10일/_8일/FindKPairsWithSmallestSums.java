package _2024년._3월._1일_10일._8일;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> queue = new PriorityQueue<List<Integer>>((o1, o2) -> {
            int firsst = o1.get(0)+o1.get(1);
            int second = o2.get(0)+o2.get(1);
            return firsst - second;
        });
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(nums1[i]);
                arr.add(nums2[i]);
                queue.add(arr);
            }
        }

    }
}
