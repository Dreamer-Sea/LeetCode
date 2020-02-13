package TargetOffer;

public class TargetOffer_9 {
    public int JumpFloorII(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int res = 2;
        for (int i = 2; i < n; i++){
            res *= 2;
        }
        return res;
    }
}
