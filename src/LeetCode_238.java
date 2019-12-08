public class LeetCode_238 {
    public int[] productExceptSelf(int[] nums){
        int[] before = new int[nums.length], after = new int[nums.length];
        before[0] = 1;
        after[nums.length-1] = 1;
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--){
            before[i] = before[i-1] * nums[i-1];
            after[j] = after[j+1] * nums[j+1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            res[i] = before[i] * after[i];
        }
        return res;
    }
}
