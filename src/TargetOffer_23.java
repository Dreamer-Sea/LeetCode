public class TargetOffer_23 {
    public boolean VerifySquenceOfBST(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        return verify(nums, 0, nums.length-1);
    }

    private boolean verify(int[] nums, int left, int right){
        if (left >= right) return true;
        int i = left;
        for (; i < right; i++){
            if (nums[i] > nums[right]) break;
        }
        for (int j = i; j < right; j++){
            if (nums[j] < nums[right]) return false;
        }
        return verify(nums, left, i-1) && verify(nums, i, right-1);
    }
}
