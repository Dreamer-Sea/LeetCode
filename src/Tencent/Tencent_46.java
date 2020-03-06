package Tencent;

public class Tencent_46 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] before = new int[len];
        int[] after = new int[len];
        before[0] = 1;
        for (int i = 1; i < len; i++){
            before[i] = before[i-1] * nums[i-1];
        }
        after[len-1] = 1;
        for (int i = len - 2; i >= 0; i--){
            after[i] = after[i+1] * nums[i+1];
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++){
            res[i] = before[i] * after[i];
        }
        return res;
    }
}
