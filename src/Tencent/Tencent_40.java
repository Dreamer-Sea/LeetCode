package Tencent;

import java.util.HashSet;
import java.util.Set;

public class Tencent_40 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            s.add(nums[i]);
        }
        return nums.length != s.size();
    }
}
