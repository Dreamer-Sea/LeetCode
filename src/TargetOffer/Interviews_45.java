package TargetOffer;

import java.util.Arrays;
import java.util.Comparator;

public class Interviews_45 {
    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return (int) (Long.valueOf(s1) - Long.valueOf(s2));
            }
        });
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str);
        }
        return builder.toString();
    }
}
