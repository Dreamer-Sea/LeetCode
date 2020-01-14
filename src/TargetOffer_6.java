public class TargetOffer_6 {
    public int minNumberInRotateArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length-1;
        while (left < right){
            int mid = (left + right) >> 1;
            if (nums[mid] >= nums[left]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
