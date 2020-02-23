package Tencent;

import java.util.Arrays;

public class Tencent_10 {

    public static void main(String[] args) {
        Tencent_10 p = new Tencent_10();
        int[] nums = {-1,2,1,-4};
        p.threeSumClosest(nums, 1);
    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++){
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if (sum > target) right--;
                else if (sum < target) left++;
                else return ans;
            }
        }
        return ans;
    }
}
