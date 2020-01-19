public class TargetOffer_13 {
    public void reOrderArray(int [] nums) {
        if (nums == null || nums.length == 0) return;
        int val, pos;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                val = nums[i];
                pos = i;
                while (pos > 0 && nums[pos-1] % 2 == 0){
                    nums[pos] = nums[pos-1];
                    pos--;
                }
                nums[pos] = val;
            }
        }
    }
}
