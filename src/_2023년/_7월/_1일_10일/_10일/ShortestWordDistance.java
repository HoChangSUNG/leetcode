package _2023년._7월._1일_10일._10일;

import java.util.HashMap;
import java.util.Map;

public class ShortestWordDistance {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        Map<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1) || wordsDict[i].equals(word2)) {
                maps.put(wordsDict[i], i);

                if (maps.get(word1) != null && maps.get(word2) != null) {
                    int dis = Math.abs(maps.get(word1) - maps.get(word2));
                    distance = Math.min(dis, distance);
                }
            }
        }
        return distance;
    }
}
