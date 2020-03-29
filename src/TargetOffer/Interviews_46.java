package TargetOffer;

public class Interviews_46 {
    public int translateNum(int num) {
        char[] cs = String.valueOf(num).toCharArray();
        int[] dp = new int[cs.length+1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++){
            dp[i] += dp[i-1];
            if (i > 1){
                int sum = (cs[i-2] - '0') * 10 + (cs[i-1] - '0');
                if (sum > 9 && sum < 26){
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[dp.length-1];
    }
}
