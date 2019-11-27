public class LeetCode_213 {

    public static void main(String[] args) {
        LeetCode_213 p = new LeetCode_213();
        int[] nums = new int[]{1, 2, 3, 1};
        p.rob(nums);
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] n1 = new int[nums.length+1];
        int[] n2 = new int[nums.length+1];
        for (int i = 0; i < nums.length - 1; i++)
            n1[i] = nums[i];
        for (int i = 1; i < nums.length; i++)
            n2[i-1] = nums[i];
        return Math.max(dfs(n1), dfs(n2));
    }

    private int dfs(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (i == 1) dp[i] = Math.max(nums[0], nums[1]);
            else dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
