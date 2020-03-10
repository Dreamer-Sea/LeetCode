package Tencent;

import java.util.Arrays;

public class Tencent_10 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int left, right, sum;
        for (int i = 0; i < nums.length; i++){
            left = i + 1; right = nums.length - 1;
            while (left < right){
                sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(ans - target)){
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
