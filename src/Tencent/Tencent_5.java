package Tencent;

public class Tencent_5 {

    public static void main(String[] args) {
        myAtoi("   -42");
    }

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0;
        char[] cs = str.trim().toCharArray();
        if (cs == null || cs.length == 0) return 0;
        if (cs[0] == '-' || cs[0] == '+') i++;
        int res = 0;
        for (; i < cs.length; i++){
            if (Character.isDigit(cs[i])) {
                if (res > Integer.MAX_VALUE / 10){
                    if (cs[0] == '-') return Integer.MIN_VALUE;
                    else return Integer.MAX_VALUE;
                }
                res *= 10;
                res += cs[i] - '0';
            }else break;
        }
        if (cs[0] == '-'){
            if (-res > 0) return Integer.MIN_VALUE;
            else return -res;
        }else {
            if (res < 0) return Integer.MAX_VALUE;
            else return res;
        }
    }
}
