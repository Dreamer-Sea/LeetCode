public class LeetCode_121 {
    public int maxProfit(int[] prices){
        if (prices.length == 0) return 0;
        int profit = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (min > prices[i]) min = prices[i];
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
