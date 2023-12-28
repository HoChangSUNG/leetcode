package _2023년._9월._1일_10일._3일;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            if (map.containsKey(cur)) {
                if (stack.isEmpty() || map.get(cur) != stack.pop()) return false;
            } else {
                stack.push(cur);
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
