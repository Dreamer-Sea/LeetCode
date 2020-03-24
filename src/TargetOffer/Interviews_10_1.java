package TargetOffer;

public class Interviews_10_1 {

    public static void main(String[] args) {
        System.out.println(fib(5));;
    }

    public static int fib(int n) {
        if (n < 1) return 0;
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
