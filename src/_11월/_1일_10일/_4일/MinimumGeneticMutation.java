package _11월._1일_10일._4일;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MinimumGeneticMutation {

    public int minMutation(String startGene, String endGene, String[] bank) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : bank) {
            map.put(s, -1);
        }
        Queue<String> q = new LinkedList<>();
        String[] alphabet = new String[]{"A", "C", "G", "T"};
        q.add(startGene);
        map.put(startGene, 0);
        while (!q.isEmpty()) {
            String cur = q.remove();
            if (cur.equals(endGene)) return map.get(endGene);
            for (int i = 0; i < startGene.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    String next = cur.substring(0, i) + alphabet[j] + cur.substring(i + 1);
                    if (map.containsKey(next) && map.get(next) == -1) {
                        map.put(next, map.get(cur) + 1);
                        q.add(next);
                    }
                }
            }
        }
        return -1;
    }
}
