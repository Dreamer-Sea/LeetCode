package TargetOffer;

public class TargetOffer_7 {
    public int Fibonacci(int n) {
        if (n < 1) return 0;
        if (n < 3) return 1;
        int a = 1, b = 1, tmp;
        for (int i = 2; i < n; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
