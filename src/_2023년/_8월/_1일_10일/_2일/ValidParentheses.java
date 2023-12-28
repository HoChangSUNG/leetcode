package _2023년._8월._1일_10일._2일;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (maps.containsKey(cur)) {
                if (stack.isEmpty()) return false;
                if (maps.get(cur) != stack.pop()) return false;
            } else stack.push(cur);
        }
        return stack.isEmpty();
    }
}
