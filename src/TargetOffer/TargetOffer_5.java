package TargetOffer;

import java.util.Stack;

public class TargetOffer_5 {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int node) {
        s1.push(node);
    }

    public int pop() {
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        return res;
    }
}
