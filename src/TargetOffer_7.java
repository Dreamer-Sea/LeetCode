public class TargetOffer_7 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(2));
    }

    // 递归
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    // 动态规划(非递归方式)
    public static int Fibonacci1(int n) {
        if (n < 1) return 0;
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++){
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
