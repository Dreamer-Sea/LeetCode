import java.util.Arrays;

public class TargetOffer_45 {
    public boolean isContinuous(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Arrays.sort(nums);
        int i = 0, zeros = 0;
        for (; i < nums.length; i++){
            if (nums[i] != 0) break;
            zeros++;
        }
        for (; i < nums.length - 1 && zeros >= 0; i++){
            if (nums[i] == nums[i+1]) return false;
            if (nums[i] + zeros + 1 >= nums[i+1]){
                zeros -= nums[i+1] - nums[i] - 1;
            }else return false;
        }
        return i == nums.length - 1;
    }
}
