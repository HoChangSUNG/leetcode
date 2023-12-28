package _2023년._8월._1일_10일._9일;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cnt = map.getOrDefault(nums[i], 0) + 1;
            if (cnt > nums.length / 2) return nums[i];
            map.put(nums[i], cnt);
        }
        return 0;
    }
}
