package TargetOffer;

public class TargetOffer_43 {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 || n < 1) return str;
        return str.substring(n) + str.substring(0, n);
    }
}
