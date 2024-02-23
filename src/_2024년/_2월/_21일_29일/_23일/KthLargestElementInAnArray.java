package _2024년._2월._21일_29일._23일;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            priorityQueue.add(nums[i]);
        }
        int result = 0;
        for(int i = 0;i<k;i++){
            result = priorityQueue.poll();
        }
        return result;
    }
}
