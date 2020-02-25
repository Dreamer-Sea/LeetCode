package Tencent;

public class Tencent_18 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0], tmp = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (tmp + nums[i] < nums[i]) tmp = 0;
            tmp += nums[i];
            if (max < tmp) max = tmp;
        }
        return max;
    }
}
