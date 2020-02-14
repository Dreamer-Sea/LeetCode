package TargetOffer;

public class TargetOffer_34 {

    public static void main(String[] args) {
        TargetOffer_34 p = new TargetOffer_34();
        p.FirstNotRepeatingChar("google");
    }

    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return  -1;
        int[] tmp = new int[128];
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++){
            tmp[cs[i]]++;
        }
        for (int i = 0; i < cs.length; i++){
            if (tmp[cs[i]] == 1) return i;
        }
        return -1;
    }
}
