package _2023년._10월._11일_20일._18일;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestCount = 0;
        for (int num : nums) {
            if (!num_set.contains(num - 1)) {
                int curCount = 1;
                int cur = num;
                while (num_set.contains(cur + 1)) {
                    cur++;
                    curCount++;
                }
                longestCount = Math.max(longestCount, curCount);
            }
        }
        return longestCount;
    }
}
