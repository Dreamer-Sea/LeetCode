package TargetOffer;

public class Interviews_42 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, tmp = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (tmp + nums[i] < nums[i]) tmp = 0;
            tmp += nums[i];
            if (max < tmp) max = tmp;
        }
        return max;
    }
}
