package TargetOffer;

public class Interviews_53_1 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = nums.length - 1, right, mid;
        while (i <= j){
            mid = (i + j) >>> 1;
            if (nums[mid] <= target) i = mid + 1;
            else j = mid - 1;
        }
        right = j;
        int left;
        i = 0; j = nums.length - 1;
        while (i <= j){
            mid = (i + j) >>> 1;
            if (nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        left = i;
        return right - left + 1;
    }
}
