package _2023년._7월._21일_31일._21일;

import java.util.*;

public class SentenceSimilarity {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {

        if (sentence1.length != sentence2.length) return false;

        Map<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < similarPairs.size(); i++) {
            String a = similarPairs.get(i).get(0);
            String b = similarPairs.get(i).get(1);
            if (!map.containsKey(a)) {
                Set<String> al = new HashSet<String>();
                map.put(a, al);
            }
            if (!map.containsKey(b)) {
                Set<String> bl = new HashSet<String>();
                map.put(b, bl);
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (int i = 0; i < sentence1.length; i++) {
            if (sentence1[i].equals(sentence2[i])) continue;
            if (!map.containsKey(sentence1[i])) return false;
            if (!map.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        return true;
    }
}
