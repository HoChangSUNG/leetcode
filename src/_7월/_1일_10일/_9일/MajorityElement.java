package _7월._1일_10일._9일;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!maps.containsKey(nums[i])) {
                maps.put(nums[i], 1);
            } else {
                maps.put(nums[i], maps.get(nums[i]) + 1);
            }
            if (maps.get(nums[i]) > nums.length / 2) {
                result = nums[i];
            }
        }

        return result;
    }
}
