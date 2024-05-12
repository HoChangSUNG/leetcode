package _2024년._5월;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if(!Character.isAlphabetic(s.charAt(i))){
                if(stack.isEmpty()){
                    stack.add(new Pair(s.charAt(i),i));
                }
                else{
                    Pair cur = new Pair(s.charAt(i),i);
                    if(isValid(stack.peek(),cur)){
                        stack.pop();
                    }else{
                        stack.add(cur);
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            sb.deleteCharAt(stack.pop().idx);
        }

        return sb.toString();
    }

    private boolean isValid(Pair before, Pair after){
        return before.isRightParentheses(after)&& before.value==1;
    }

    class Pair {
        int value;
        int idx;

        public Pair(char parentheses, int idx) {
            value = parentheses == ')' ? -1 : 1;
            this.idx = idx;
        }

        public boolean isRightParentheses(Pair other){
            return this.value+other.value == 0;
        }
    }
}
