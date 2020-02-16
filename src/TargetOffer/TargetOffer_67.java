package TargetOffer;

public class TargetOffer_67 {
    public int cutRope(int n) {
        if (n < 1) return 0;
        int[] dp = {0, 1, 1};
        for (int i = 3; i < n + 1; i++){
            dp[i % 3] = max3(Math.max(dp[(i-1) % 3], i-1), 2 * Math.max(dp[(i-2) % 3], i-2), 3 * Math.max(dp[(i-3) % 3], i-3));
        }
        return dp[n % 3];
    }

    private int max3(int n1, int n2, int n3){
        return Math.max(Math.max(n1, n2), n3);
    }
}
