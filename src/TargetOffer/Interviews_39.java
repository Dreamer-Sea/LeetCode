package TargetOffer;

public class Interviews_39 {
    public int majorityElement(int[] nums) {
        int num = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++){
            if (num == nums[i]) count++;
            else count--;
            if (count == 0){
                num = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++){
            if (num == nums[i]) count++;
        }
        return count*2 > nums.length ? num : -1;
    }
}
