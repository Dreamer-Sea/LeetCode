import java.util.List;

public class LeetCode_120 {
    public int minimumTotal(List<List<Integer>> triangle){
        int row = triangle.size();
        int[] dp = new int[row+1];
        for (int level = row-1; level >= 0; level--){
            for (int i = 0; i <= level; i++){
                dp[i] = Math.min(dp[i], dp[i+1]) + triangle.get(level).get(i);
            }
        }
        return dp[0];
    }
}
