package Tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tencent_9 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) return res;
        int left, right, sum;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            left = i + 1; right = nums.length - 1;
            while (left < right){
                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if (sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}
