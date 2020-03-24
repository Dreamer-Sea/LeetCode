package TargetOffer;

public class Interviews_10_2 {
    public int numWays(int n) {
        if (n < 1) return 1;
        int a = 0, b = 1, tmp;
        for (int i = 0; i < n; i++){
            tmp = (a + b) % 1000000007;
            a = b;
            b = tmp;
        }
        return b;
    }
}
