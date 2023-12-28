package _2023년._10월._11일_20일._15일;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() != 0) {
                    deque.addFirst(sb.toString());
                    sb.setLength(0);
                    deque.addFirst(s.charAt(i) + "");
                }
            }
        }
        if (sb.length() != 0) {
            deque.addFirst(sb.toString());
            sb.setLength(0);
        }
        sb.append(deque.pop());
        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        return sb.toString().trim();
    }
}
