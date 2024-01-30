package _2024년._1월._21일_31일._30일;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for (int num : nums) set.add(num);
        if (set.size() == 0) return 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int curCount = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    curCount++;
                }
                longest = Math.max(longest, curCount);
            }
        }
        return longest;
    }
}
