package _2024년._1월._11일_20일._13일;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            int[] keys = new int[26];
            Arrays.fill(keys, -1);
            for (int i = 0; i < str.length(); i++) {
                keys[str.charAt(i) - 'a'] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#" + keys[i]);
            }
            anagrams.computeIfAbsent(sb.toString(), v -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }
}
