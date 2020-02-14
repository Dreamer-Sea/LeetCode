package TargetOffer;

import java.util.Arrays;

public class TargetOffer_28 {
    public int MoreThanHalfNum_Solution(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int t = nums[nums.length / 2];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == t) count++;
        }
        return (count > nums.length / 2) ? t : 0;
    }
}
