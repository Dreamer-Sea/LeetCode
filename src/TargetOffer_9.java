public class TargetOffer_9 {
    public int JumpFloorII(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        int a = 1;
        for (int i = 2; i <= n; i++){
            a *= 2;
        }
        return a;
    }
}
