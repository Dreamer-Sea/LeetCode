package TargetOffer;

import java.util.Arrays;

public class Interviews_61 {
    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Arrays.sort(nums);
        int zeros = 0;
        int i = 0;
        for (; i < nums.length; i++){
            if (nums[i] != 0) break;
            zeros++;
        }
        for (; i < nums.length-1 && zeros >= 0; i++){
            if (nums[i] == nums[i+1]) return false;
            if (nums[i] + zeros + 1 >= nums[i+1]) zeros -= nums[i+1] - nums[i] - 1;
            else return false;
        }
        return i == nums.length - 1;
    }
}
