package Tencent;

public class Tencent_18 {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0],tmp = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > nums[i] + tmp) tmp = 0;
            tmp += nums[i];
            if (max < tmp) max = tmp;
        }
        return max;
    }
}
