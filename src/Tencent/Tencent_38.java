package Tencent;

public class Tencent_38 {
    public int majorityElement(int[] nums) {
        int count = 1, num = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (num == nums[i]) count++;
            else count--;
            if (count == 0){
                count = 1;
                num = nums[i];
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++){
            if (num == nums[i]) count++;
        }
        return count*2 > nums.length ? num : -1;
    }
}
