package TargetOffer;

import java.util.Arrays;

public class TargetOffer_50 {
    public boolean duplicate(int[] nums, int len, int[] dup) {
        if (nums == null || len == 0) return false;
        for (int i = 0; i < len; i++){
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    dup[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
