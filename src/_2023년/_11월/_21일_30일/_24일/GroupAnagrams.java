package _2023년._11월._21일_30일._24일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            int[] key = new int[26];

            String cur = strs[i];
            for(int j = 0;j<cur.length();j++){
                key[cur.charAt(j)-'a'] +=1;
            }
            StringBuilder sb = new StringBuilder("");
            for(int j = 0;j<26;j++){
                sb.append('#');
                sb.append(key[j]);
            }
            map.computeIfAbsent(sb.toString(),v->new ArrayList<>()).add(cur);
        }

        return new ArrayList<>(map.values());
    }
}
