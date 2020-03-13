package Tencent;

public class Tencent_15 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        search(nums, 0);
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] > nums[left]){
                if (target < nums[mid] && target >= nums[left]) right = mid - 1;
                else left = mid + 1;
            }else if (nums[mid] < nums[left]){
                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }else left++;
        }
        return -1;
    }
}
