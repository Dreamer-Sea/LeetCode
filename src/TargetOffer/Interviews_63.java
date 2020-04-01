package TargetOffer;

public class Interviews_63 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = prices[0], profit, res = 0;
        for (int i = 1; i < prices.length; i++){
            if (min > prices[i]) min = prices[i];
            profit = prices[i] - min;
            if (res < profit) res = profit;
        }
        return res;
    }
}
