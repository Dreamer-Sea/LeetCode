package TargetOffer;

public class TargetOffer_44 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) return str;
        String[] strs = str.split(" ");
        if (strs == null || strs.length == 0) return str;
        int left = 0, right = strs.length - 1;
        while (left < right){
            swap(strs, left++, right--);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs.length; i++){
            builder.append(strs[i]);
            if (i != strs.length - 1) builder.append(" ");
        }
        return builder.toString();
    }

    private void swap(String[] strs, int x, int y){
        String tmp = strs[x];
        strs[x] = strs[y];
        strs[y] = tmp;
    }
}
