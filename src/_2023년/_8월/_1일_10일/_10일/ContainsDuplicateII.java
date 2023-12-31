package _2023년._8월._1일_10일._10일;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i - k - 1 >= 0) window.remove(nums[i - k - 1]);
            if (window.contains(nums[i])) return true;
            window.add(nums[i]);
        }
        return false;
    }
}
