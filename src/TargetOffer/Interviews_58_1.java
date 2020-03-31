package TargetOffer;

public class Interviews_58_1 {

    public static void main(String[] args) {
        reverseWords("a good   example");
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] strs = s.trim().split(" ");
        if (strs == null || strs.length == 0) return s;
        StringBuilder builder = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--){
            if ("".equals(strs[i])) continue;
            builder.append(strs[i]);
            if (i != 0) builder.append(" ");
        }
        return builder.toString();
    }
}
