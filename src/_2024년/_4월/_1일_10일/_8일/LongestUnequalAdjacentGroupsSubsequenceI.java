package _2024년._4월._1일_10일._8일;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> answer = new ArrayList<>();
        answer.add(words[0]);
        int prev = groups[0];
        for (int i = 1; i < words.length; i++) {
            if (prev != groups[i]) {
                answer.add(words[i]);
                prev = groups[i];
            }
        }
        return answer;
    }
}
