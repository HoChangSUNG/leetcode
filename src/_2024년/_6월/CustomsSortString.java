package _2024년._6월;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomsSortString {
    public String customSortString(String order, String s) {
        int[] prior = new int[26];
        int priority = 1;
        for (int i = 0; i < order.length(); i++) {
            prior[order.charAt(i) - 'a'] = priority++;
        }
        Queue<Character> queue = new PriorityQueue<>(Comparator.comparingInt(o -> prior[o - 'a']));
        for (Character c : s.toCharArray()) {
            queue.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}
