package TargetOffer;

public class Interviews_53_2 {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i) return i;
        }
        return -1;
    }
}
