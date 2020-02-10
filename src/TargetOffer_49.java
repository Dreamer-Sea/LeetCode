public class TargetOffer_49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        char[] cs = str.toCharArray();
        int i = 0;
        if (cs[i] == '+' || cs[i] == '-') i++;
        int res = 0;
        for (; i < cs.length; i++){
            if (!Character.isDigit(cs[i])) return 0;
            res *= 10;
            res += cs[i] - '0';
        }

        if (cs[0] == '-'){
            if (-res > 0) return 0;
            return -res;
        }

        if (res < 0) return 0;
        return res;
    }
}
