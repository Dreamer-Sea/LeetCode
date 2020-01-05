import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_120 {

    public static void main(String[] args) {
        LeetCode_120 p = new LeetCode_120();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        p.minimumTotal(triangle);
    }

    public int minimumTotal(List<List<Integer>> triangle){
        if (triangle.size() == 0) return 0;
        int m = triangle.size(), n = triangle.get(m-1).size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++){
            dp[i] = triangle.get(m-1).get(i);
        }
        for (int i = m-2; i >= 0; i--){
            for (int j = 0; j < i+1; j++){
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
