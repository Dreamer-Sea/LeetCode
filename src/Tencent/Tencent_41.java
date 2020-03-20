package Tencent;

import java.util.HashSet;
import java.util.Set;

public class Tencent_41 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        return s.size() != nums.length;
    }
}
