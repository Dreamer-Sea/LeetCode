package TargetOffer;

public class Interviews_60 {
    public double[] twoSum(int n) {
        double[][] dp = new double[n+1][6*n+1];
        double prob = 1.0 / 6.0;
        for (int i = 1; i <= 6; i++) dp[1][i] = prob;
        for (int i = 2; i <= n; i++){
            for (int j = i; j <= i * 6; j++){
                for (int k = 1; k <= j && k <= 6; k++){
                    dp[i][j] += (prob * dp[i-1][j-k]);
                }
            }
        }
        double[] res = new double[5 * n + 1];
        System.arraycopy(dp[n], n, res, 0, res.length);
        return res;
    }
}
