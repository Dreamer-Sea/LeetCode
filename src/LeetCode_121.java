public class LeetCode_121 {
    public int maxProfit(int[] prices){
        if (prices.length == 0) return 0;
        int profit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (min > prices[i]) min = prices[i];
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
