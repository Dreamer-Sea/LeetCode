package Tencent;

public class Tencent_28 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int maxProfit = 0, min = prices[0], profit;
        for (int i = 1; i < prices.length; i++){
            if (min > prices[i]) min = prices[i];
            profit = prices[i] - min;
            if (maxProfit < profit) maxProfit = profit;
        }
        return maxProfit;
    }
}
