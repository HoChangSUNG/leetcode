package _2023년._9월._1일_10일._3일;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                nums[idx++] = nums[i];
                set.add(nums[i]);
            }
        }
        return idx;
    }
}
