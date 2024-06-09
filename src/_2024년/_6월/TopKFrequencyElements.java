package _2024년._6월;

import java.util.*;

public class TopKFrequencyElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        queue.addAll(frequency.entrySet());
        int[] result = new int[k];
        int index = 0;
        while(index<k){
            result[index++] = queue.poll().getKey();
        }
        return result;
    }
}
