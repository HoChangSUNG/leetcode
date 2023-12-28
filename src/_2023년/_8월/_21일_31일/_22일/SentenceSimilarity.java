package _2023년._8월._21일_31일._22일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentenceSimilarity {

    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) return false;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < similarPairs.size(); i++) {
            List<String> a = map.getOrDefault(similarPairs.get(i).get(0), new ArrayList<String>());
            a.add(similarPairs.get(i).get(1));
            map.put(similarPairs.get(i).get(0), a);

            List<String> b = map.getOrDefault(similarPairs.get(i).get(1), new ArrayList<String>());
            b.add(similarPairs.get(i).get(0));
            map.put(similarPairs.get(i).get(1), b);
        }
        for (int i = 0; i < sentence1.length; i++) {
            if (sentence1[i].equals(sentence2[i])) continue;
            if (!map.containsKey(sentence1[i])) return false;
            System.out.print(i);

            if (!map.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        return true;
    }
}
