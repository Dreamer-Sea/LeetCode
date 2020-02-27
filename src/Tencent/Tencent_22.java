package Tencent;

public class Tencent_22 {
    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) return 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++){
            for (int j = 1; j < n; j++){
                if (i == 0) dp[j] = 1;
                else dp[j] += dp[j-1];
            }
        }
        return dp[n - 1];
    }
}
