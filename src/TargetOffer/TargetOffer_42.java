package TargetOffer;

import java.util.ArrayList;

public class TargetOffer_42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] nums, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int left = 0, right = nums.length - 1;
        while (left < right){
            int tmp = nums[left] + nums[right];
            if (tmp == sum){
                res.add(nums[left]);
                res.add(nums[right]);
                return res;
            }
            if (tmp < sum) left++;
            else right--;
        }
        return res;
    }
}
