package Tencent;

public class Tencent_47 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int[] before = new int[nums.length];
        int[] after = new int[nums.length];
        before[0] = 1;
        after[nums.length-1] = 1;
        for (int i = 1; i < before.length; i++){
            before[i] = before[i-1] * nums[i-1];
        }
        for (int i = after.length-2; i >= 0; i--){
            after[i] = after[i+1] * nums[i+1];
        }
        for (int i = 0; i < before.length; i++){
            before[i] *= after[i];
        }
        return before;
    }
}
