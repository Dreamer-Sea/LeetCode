public class LeetCode_151 {
    public String reverseWords(String s){
        if (s.length() == 0) return s;
        s = s.trim();
        String[] strs = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--){
            if ("".equals(strs[i])) continue;
            builder.append(strs[i]);
            if (i != 0) builder.append(" ");
        }
        return builder.toString();
    }
}
