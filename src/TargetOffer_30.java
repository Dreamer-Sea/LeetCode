public class TargetOffer_30 {

    public static void main(String[] args) {
        TargetOffer_30 p = new TargetOffer_30();
        int[] nums = {1,-2,3,10,-4,7,2,-5};
        p.FindGreatestSumOfSubArray(nums);
    }

    public int FindGreatestSumOfSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] + nums[i-1] > nums[i]) nums[i] += nums[i-1];
            if (max < nums[i]) max = nums[i];
        }
        return max;
    }
}
