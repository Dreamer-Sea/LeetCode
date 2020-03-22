package Tencent;

public class Tencent_50 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] strs = s.split(" ");
        char[] tmp;
        int i, j;
        StringBuilder builder = new StringBuilder();
        for (int k = 0; k < strs.length; k++){
            i = 0; j = strs[k].length()-1;
            tmp = strs[k].toCharArray();
            while (i < j){
                swap(tmp, i, j);
                i++; j--;
            }
            builder.append(String.valueOf(tmp));
            if (k != strs.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    private void swap(char[] cs, int x, int y){
        char c = cs[x];
        cs[x] = cs[y];
        cs[y] = c;
    }
}
