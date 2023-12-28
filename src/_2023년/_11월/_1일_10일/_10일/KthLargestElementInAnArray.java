package _2023년._11월._1일_10일._10일;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            queue.add(num);
        }
        Integer result = null;
        for(int i = 0;i<k;i++){
            result = queue.poll();
        }
        return result;
    }
}
