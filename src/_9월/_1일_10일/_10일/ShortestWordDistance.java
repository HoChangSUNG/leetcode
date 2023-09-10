package _9월._1일_10일._10일;

import java.util.HashMap;
import java.util.Map;

public class ShortestWordDistance {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        Map<String, Integer> map = new HashMap<>();
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1) && map.containsKey(word2)) {
                result = Math.min(i - map.get(word2), result);
            } else if (wordsDict[i].equals(word2) && map.containsKey(word1)) {
                result = Math.min(i - map.get(word1), result);
            }
            map.put(wordsDict[i], i);
        }
        return result;
    }
}
