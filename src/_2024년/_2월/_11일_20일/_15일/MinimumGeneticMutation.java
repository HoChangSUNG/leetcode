package _2024년._2월._11일_20일._15일;

import java.util.*;

public class MinimumGeneticMutation {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Map<String, Integer> visited = new HashMap<>();
        Set<String> valid = new HashSet<>();
        for (String element : bank) {
            valid.add(element);
        }
        valid.add(startGene);
        String[] genes = new String[]{"A", "C", "G", "T"};

        Queue<String> queue = new LinkedList<>();
        queue.add(startGene);
        visited.put(startGene, 0);
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if (visited.containsKey(endGene)) return visited.get(endGene);
            for (int i = 0; i < cur.length(); i++) {
                for (int j = 0; j < genes.length; j++) {
                    String temp = cur.substring(0, i) + genes[j] + cur.substring(i + 1, cur.length());
                    if (valid.contains(temp) && !visited.containsKey(temp)) {
                        queue.add(temp);
                        visited.put(temp, visited.get(cur) + 1);
                    }
                }

            }
        }
        return -1;
    }
}
