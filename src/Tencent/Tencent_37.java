package Tencent;

public class Tencent_37 {
    public int majorityElement(int[] nums) {
        int num = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++){
            if (num == nums[i]) count++;
            else count--;
            if (count <= 0){
                num = nums[i];
                count = 1;
            }
        }
        return num;
    }
}
