public class TargetOffer_50 {
    public boolean duplicate(int nums[],int length,int [] dup) {
        if (nums == null || length <= 0) return false;
        for (int i = 0; i < length; i++){
            while (i != nums[i]){
                if (nums[i] == nums[nums[i]]){
                    dup[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
