public class LeetCode_53 {
    public int maxSubArray(int[] nums){
        if (nums.length == 0) return 0;
        int max = nums[0], sum = max;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i] + sum){
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
