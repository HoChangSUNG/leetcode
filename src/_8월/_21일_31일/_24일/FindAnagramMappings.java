package _8월._21일_31일._24일;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FindAnagramMappings {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.get(nums2[i]).add(i);
            } else {
                Queue<Integer> temp = new LinkedList<>();
                temp.add(i);
                map.put(nums2[i], temp);
            }
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]).poll();
        }
        return res;
    }
}
