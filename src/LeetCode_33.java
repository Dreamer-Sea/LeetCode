public class LeetCode_33 {
    public int search(int[] nums, int target){
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] > nums[left]){
                if (target < nums[mid] && target >= nums[left]) right = mid - 1;
                else left = mid + 1;
            }else if (nums[mid] < nums[left]){
                if (target <= nums[right] && target > nums[mid]) left = mid + 1;
                else right = mid - 1;
            }else left++;
        }
        return -1;
    }
}
