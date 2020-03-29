package TargetOffer;

public class Interviews_43 {
    public int countDigitOne(int n) {
        return dfs(n);
    }

    private int dfs(int n){
        if (n <= 0) return 0;
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length() - 1);
        int last = n - high * pow;
        if (high == 1){
            return dfs(pow - 1) + dfs(last) + last + 1;
        }else{
            return pow + high * dfs(pow - 1) + dfs(last);
        }
    }
}
