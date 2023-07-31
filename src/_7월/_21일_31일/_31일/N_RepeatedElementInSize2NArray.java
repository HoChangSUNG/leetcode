package _7월._21일_31일._31일;

import java.util.HashMap;
import java.util.Map;

public class N_RepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (n / 2 == map.get(nums[i])) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
