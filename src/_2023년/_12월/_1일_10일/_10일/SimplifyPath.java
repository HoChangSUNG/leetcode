package _2023년._12월._1일_10일._10일;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> deque = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            String cur = split[i];
            if (cur.isEmpty() || cur.equals(".")) continue;
            else if (cur.equals("..")) {
                if (!deque.isEmpty()) deque.removeLast();
            } else deque.addLast(cur);
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append("/");
            sb.append(deque.removeFirst());
        }
        if (sb.length() == 0) return "/";
        return sb.toString();
    }
}
