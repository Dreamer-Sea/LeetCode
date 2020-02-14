package TargetOffer;

public class TargetOffer_40 {
    public void FindNumsAppearOnce(int[] nums, int[] num1 , int[] num2) {
        if (nums == null || nums.length == 0) return;
        int xor = 0, flag = 1;
        for (int i = 0; i < nums.length; i++)
            xor ^= nums[i];
        while ((xor & flag) == 0) flag <<= 1;
        for (int i = 0; i < nums.length; i++){
            if ((nums[i] & flag) == 0) num1[0] ^= nums[i];
            else num2[0] ^= nums[i];
        }
    }
}
