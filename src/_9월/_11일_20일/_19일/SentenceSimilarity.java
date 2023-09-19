package _9월._11일_20일._19일;

import java.util.*;

public class SentenceSimilarity {

    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) return false;
        Map<String, Set<String>> similar = new HashMap<>();
        for (List<String> pair : similarPairs) {
            similar.computeIfAbsent(pair.get(0), value -> new HashSet<String>()).add(pair.get(1));
            similar.computeIfAbsent(pair.get(1), value -> new HashSet<String>()).add(pair.get(0));
        }

        for (int i = 0; i < sentence1.length; i++) {
            if (sentence1[i].equals(sentence2[i])) continue;
            if (!similar.containsKey(sentence1[i]) || !similar.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        return true;
    }
}
