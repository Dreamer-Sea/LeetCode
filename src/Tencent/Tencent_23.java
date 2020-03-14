package Tencent;

public class Tencent_23 {
    public int climbStairs(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2, tmp;
        for (int i = 2; i < n; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
