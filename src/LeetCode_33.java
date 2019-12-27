public class LeetCode_33 {

    public static void main(String[] args) {
        LeetCode_33 p = new LeetCode_33();
        int[] nums = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        p.search(nums, 8);
    }

    public int search(int[] nums, int target){
        if (nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low + high) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[low] > nums[mid]){
                if (target <= nums[high] && target > nums[mid]) low = mid + 1;
                else high = mid - 1;
            }else if (nums[low] < nums[mid]){
                if (target >= nums[low] && target < nums[mid]) high = mid - 1;
                else low = mid + 1;
            }else low++;
        }
        return -1;
    }
}
