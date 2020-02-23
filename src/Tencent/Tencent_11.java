package Tencent;

import java.util.Stack;

public class Tencent_11 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cs.length; i++){
            if (cs[i] == '(') stack.push(')');
            else if (cs[i] == '{') stack.push('}');
            else if (cs[i] == '[') stack.push(']');
            else {
                if (stack.empty()) return false;
                if (stack.pop() != cs[i]) return false;
            }
        }
        return stack.empty();
    }
}
