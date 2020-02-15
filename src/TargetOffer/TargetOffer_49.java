package TargetOffer;

public class TargetOffer_49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0, sum = 0;
        char[] cs = str.toCharArray();
        if (cs[0] == '+' || cs[0] == '-') i++;
        for (; i < cs.length; i++){
            if (!Character.isDigit(cs[i])) return 0;
            sum *= 10;
            sum += cs[i] - '0';
        }
        if (cs[0] == '-'){
            if (-sum > 0) return 0;
            else return -sum;
        }

        return sum < 0 ? 0 : sum;
    }
}
