package TargetOffer;

import java.util.HashMap;

public class Interviews_50 {
    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) return ' ';
        int[] tmp = new int[128];
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++){
            tmp[cs[i]]++;
        }
        for (int i = 0; i < cs.length; i++){
            if (tmp[cs[i]] == 1) return cs[i];
        }
        return ' ';
    }
}
