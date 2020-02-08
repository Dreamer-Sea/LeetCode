public class TargetOffer_43 {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0) return "";
        return str.substring(n) + str.substring(0, n);
    }
}
