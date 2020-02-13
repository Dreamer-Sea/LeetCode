package TargetOffer;

public class TargetOffer_13 {

    public static void main(String[] args) {
        TargetOffer_13 p = new TargetOffer_13();
        int[] nums = {2,4,6,1,3,5,7};
        p.reOrderArray(nums);
    }

    public void reOrderArray(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int pos, val;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                pos = i;
                val = nums[i];
                while (pos > 0 && nums[pos - 1] % 2 == 0) {
                    nums[pos] = nums[pos - 1];
                    pos--;
                }
                nums[pos] = val;
            }

        }
    }

}
