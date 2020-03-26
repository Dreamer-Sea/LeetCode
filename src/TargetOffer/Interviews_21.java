package TargetOffer;

public class Interviews_21 {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int i = 0, j = nums.length - 1,tmp;
        while (i < j){
            while (i < j && nums[i] % 2 == 1) i++;
            while (i < j && nums[j] % 2 == 0) j--;
            if (i < j){
                tmp = nums[i];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }
        return nums;
    }
}
