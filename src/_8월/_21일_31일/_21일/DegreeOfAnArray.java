package _8월._21일_31일._21일;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer[]> map = new HashMap<>();
        int maxCnt = 1;
        int shortest = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer[] temp = map.get(nums[i]);
                temp[2] = i;
                temp[0] += 1;
                maxCnt = Math.max(maxCnt, temp[0]);
            } else {
                map.put(nums[i], new Integer[]{1, i, i});
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            Integer[] val = (Integer[]) entry.getValue();
            if (val[0] == maxCnt && shortest > (val[2] - val[1] + 1)) {
                shortest = val[2] - val[1] + 1;
            }
        }
        return shortest;
    }
}
