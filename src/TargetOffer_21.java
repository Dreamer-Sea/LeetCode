import java.util.Stack;

public class TargetOffer_21 {
    public boolean IsPopOrder(int[] pushA,int[] popA) {
        Stack<Integer> s = new Stack<>();
        int popIdx = 0;
        for (int i = 0; i < pushA.length; i++){
            s.push(pushA[i]);
            while (!s.isEmpty() && popA[popIdx] == s.peek()){
                s.pop();
                popIdx++;
            }
        }
        return s.isEmpty();
    }
}
