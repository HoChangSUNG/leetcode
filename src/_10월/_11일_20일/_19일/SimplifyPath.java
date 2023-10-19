package _10월._11일_20일._19일;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> pathStack = new ArrayDeque<>();
        String[] split = path.split("/");
        for (String s : split) {
            if (s.equals("..")) {
                if (!pathStack.isEmpty()) {
                    pathStack.removeLast();
                }
            } else if (s.equals("") || s.equals(".")) {
                continue;
            } else {
                pathStack.addLast(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pathStack.isEmpty()) {
            sb.append("/");
            sb.append(pathStack.removeFirst());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
