package TargetOffer;

public class Interviews_11 {
    public int minArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = nums.length - 1, mid;
        while (i < j){
            mid = (i + j) >> 1;
            if (nums[mid] > nums[i]) i = mid + 1;
            else if (nums[mid] < nums[i]) j = mid;
            else i++;
        }
        return nums[i];
    }
}
