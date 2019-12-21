import java.util.Stack;

public class LeetCode_155 {
    class MinStack{

        private Stack<Integer> stack;
        private int min;

        public MinStack() {
            stack = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if (min >= x){
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            if (stack.pop() == min){
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        LeetCode_155 p = new LeetCode_155();
        p.test();
    }

    private MinStack stack = new MinStack();

    private void test(){
        stack.push(0);
        stack.push(1);
        stack.push(0);
        stack.getMin();
        stack.pop();
        stack.getMin();
    }
}
