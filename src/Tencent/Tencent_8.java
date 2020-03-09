package Tencent;

public class Tencent_8 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            if (prefix.length() > strs[i].length()) prefix = strs[i];
        }
        for (int i = 0; i < strs.length; i++){
            int j = 0;
            while (j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) j++;
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
