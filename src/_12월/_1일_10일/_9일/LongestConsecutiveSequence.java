package _12월._1일_10일._9일;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longest = 1;
        if (set.isEmpty()) return 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int curCount = 1;
                while (set.contains(cur + 1)) {
                    curCount++;
                    cur++;
                }
                longest = Math.max(longest, curCount);
            }
        }
        return longest;
    }
}
