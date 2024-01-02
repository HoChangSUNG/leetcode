package _2024년._1월._1일_10일._1일;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largest = new PriorityQueue(Collections.reverseOrder());
        for (int num : nums) {
            largest.add(num);
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = largest.poll();
        }
        return result;
    }
}
