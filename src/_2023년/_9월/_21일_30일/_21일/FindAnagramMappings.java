package _2023년._9월._21일_30일._21일;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Deque<Integer>> map = new HashMap<>();
        int[] anagram = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.computeIfAbsent(nums2[i], value -> new ArrayDeque<Integer>()).addFirst(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            anagram[i] = map.get(nums1[i]).removeFirst();
        }
        return anagram;
    }
}
