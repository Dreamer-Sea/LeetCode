package TargetOffer;

public class Interviews_47 {

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        maxValue(grid);
    }

    public static int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int[] dp = new int[grid[0].length + 1];
        for (int i = 1; i < dp.length; i++){
            dp[i] = grid[0][i-1] + dp[i-1];
        }
        for (int i = 1; i < grid.length; i++){
            for (int j = 1; j < dp.length; j++){
                dp[j] = Math.max(dp[j], dp[j-1]) + grid[i][j-1];
            }
        }
        return dp[dp.length-1];
    }
}
