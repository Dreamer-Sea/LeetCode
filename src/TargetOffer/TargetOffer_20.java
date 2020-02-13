package TargetOffer;

import java.util.Stack;

public class TargetOffer_20 {

    private Stack<Integer> s = new Stack<>();
    private int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x <= min){
            s.push(min);
            min = x;
        }
        s.push(x);
    }

    public void pop() {
        if (s.pop() == min){
            min = s.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return min;
    }
}
