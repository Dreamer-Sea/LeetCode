package TargetOffer;

public class TargetOffer_2 {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) return "";
        int idx;
        while (str.indexOf(" ") != -1){
            idx = str.indexOf(" ");
            str.replace(idx, idx+1, "%20");
        }
        return str.toString();
    }
}
