public class LeetCode_122 {

    public static void main(String[] args) {
        LeetCode_122 p = new LeetCode_122();
        p.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public int maxProfit(int[] prices){
        if (prices == null || prices.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
