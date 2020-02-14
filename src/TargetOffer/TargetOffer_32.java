package TargetOffer;

import java.util.Arrays;
import java.util.Comparator;

public class TargetOffer_32 {
    public String PrintMinNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] ss = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            ss[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ss, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ss.length; i++)
            builder.append(ss[i]);
        return builder.toString();
    }
}
