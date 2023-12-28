package _2023년._10월._1일_10일._2일;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            map.computeIfAbsent(new String(chars), v -> new ArrayList<String>()).add(strs[i]);
        }
        return map.values().stream().collect(Collectors.toList());
    }

}
