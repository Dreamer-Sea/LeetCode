package TargetOffer;

import java.util.Stack;

public class TargetOffer_21 {
    public boolean IsPopOrder(int[] pushA,int[] popA) {
        if ((pushA == null || pushA.length == 0) && (popA == null || popA.length == 0)) return false;
        Stack<Integer> s = new Stack<>();
        int popIdx = 0;
        for (int i = 0; i < pushA.length; i++){
            s.push(pushA[i]);
            while (!s.empty() && s.peek() == popA[popIdx]) {
                popIdx++;
                s.pop();
            }
        }
        return s.empty();
    }
}
