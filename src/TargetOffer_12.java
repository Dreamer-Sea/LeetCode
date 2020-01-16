public class TargetOffer_12 {
    public double Power(double base, int exp) {
        boolean flag = exp < 0;
        if (flag) exp = -exp;
        double ans = getPower(base, exp);
        return flag ? 1/ans : ans;
    }

    private double getPower(double base, int exp){
        if (exp == 0) return 1;
        if (exp == 1) return base;
        double ans = getPower(base, exp >> 1);
        ans *= ans;
        if ((exp & 1) == 1) ans *= base;
        return ans;
    }
}
