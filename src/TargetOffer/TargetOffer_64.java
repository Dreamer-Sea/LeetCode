package TargetOffer;

import java.util.ArrayList;

public class TargetOffer_64 {

    public static void main(String[] args) {
        TargetOffer_64 p = new TargetOffer_64();
        int[] nums = {2,3,4,2,6,2,5,1};
        p.maxInWindows(nums, 3);
    }

    public ArrayList<Integer> maxInWindows(int[] nums, int size){
        ArrayList<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || size < 1) return res;
        int max;
        for (int i = 0; i <= nums.length - size; i++){
            max = nums[i];
            for (int j = i; j < i + size; j++){
                if (max < nums[j]) max = nums[j];
            }
            res.add(max);
        }
        return res;
    }
}
