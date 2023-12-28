package _2023년._9월._21일_30일._27일;

import java.util.HashMap;
import java.util.Map;

public class N_RepeatedElementInSizeNArray {

    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == nums.length / 2) return num;
        }
        return -1;
    }
}
