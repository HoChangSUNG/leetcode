package _2024년._1월._21일_31일._31일;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] splitPath = path.split("/");
        Deque<String> pathStack = new LinkedList<>();
        for (String splited : splitPath) {
            if (!splited.isBlank() && !splited.equals(".")) {
                if (splited.equals("..")) {
                    if (!pathStack.isEmpty()) pathStack.removeLast();
                } else pathStack.addLast(splited);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!pathStack.isEmpty()) {
            result.append("/");
            result.append(pathStack.removeFirst());
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
