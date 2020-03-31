package TargetOffer;

import java.util.Arrays;

public class Interviews_56_2 {

    public static void main(String[] args) {
        singleNumber(new int[]{4,10,4,10,2,4,10});
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++){
            if (nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
            else if (nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
            else if (nums[0] != nums[1]) return nums[0];
        }
        return -1;
    }
}
