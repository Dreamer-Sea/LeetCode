package TargetOffer;

public class Interviews_56_1 {
    public int[] singleNumbers(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int point = xor & (-xor);
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            if ((nums[i] & point) == point) res[0] ^= nums[i];
            else res[1] ^= nums[i];
        }
        return res;
    }
}
