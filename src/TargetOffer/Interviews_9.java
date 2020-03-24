package TargetOffer;

import java.util.Stack;

public class Interviews_9 {
    class CQueue {

        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public CQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void appendTail(int value) {
            s1.push(value);
        }

        public int deleteHead() {
            if (s2.isEmpty()){
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.isEmpty() ? -1 : s2.pop();
        }
    }
}
