package TargetOffer;

public class Interviews_67 {

    public static void main(String[] args) {
//        strToInt("42");
    }

    public int strToInt(String str) {
        if(str==null) return 0;
        int n = str.length(), i = 0, res = 0;
        boolean is_negative=false;
        while(i < n && str.charAt(i) ==' ') ++i;
        if(i == n) return 0;
        if(str.charAt(i) == '-') is_negative = true;
        if(str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        while(i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            int temp = str.charAt(i) - '0';
            if(!is_negative && (res > Integer.MAX_VALUE || (res == Integer.MAX_VALUE / 10 && temp >= 7)))
                return Integer.MAX_VALUE;
            if(is_negative && (-res < Integer.MIN_VALUE / 10 || (-res == Integer.MIN_VALUE / 10 && temp >= 8)))
                return Integer.MIN_VALUE;
            res = res * 10 + temp;
            ++i;
        }
        return is_negative ? -res : res;
    }
}
