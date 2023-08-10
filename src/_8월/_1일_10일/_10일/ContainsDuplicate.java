package _8월._1일_10일._10일;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (sets.contains(nums[i])) return true;
            sets.add(nums[i]);
        }
        return false;
    }
}
