package _2024년._2월._21일_29일._29일;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        boolean[] visited = new boolean[s.length() + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (start == s.length()) return true;
            for (int end = start + 1; end <= s.length(); end++) {
                if (visited[end]) continue;
                if (words.contains(s.substring(start, end))) {
                    visited[end] = true;
                    queue.add(end);
                }
            }
        }
        return false;
    }
}
