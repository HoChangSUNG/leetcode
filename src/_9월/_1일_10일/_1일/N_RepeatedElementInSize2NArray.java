package _9월._1일_10일._1일;

import java.util.HashSet;
import java.util.Set;

public class N_RepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return nums[i];
            else set.add(nums[i]);
        }
        return 0;
    }
}
