package Tencent;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class Tencent_3 {

    private String res = "";

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++){
            helper(s, i, i);
            helper(s, i, i+1);
        }
        return res;
    }

    private void helper(String s, int i, int j){
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        String sub = s.substring(i+1, j);
        res = res.length() > sub.length() ? res : sub;
    }
}
