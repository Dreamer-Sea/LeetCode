package TargetOffer;

import java.util.Stack;

public class Interviews_30 {

    class MinStack {

        private Stack<Integer> s;
        private int min;

        /** initialize your data structure here. */
        public MinStack() {
            s = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if (x <= min){
                s.push(min);
                min = x;
            }
            s.push(x);
        }

        public void pop() {
            if (s.pop() == min) min = s.pop();
        }

        public int top() {
            return s.peek();
        }

        public int min() {
            return min;
        }
    }

}
