package Tencent;

public class Tencent_4 {

    public static void main(String[] args) {
        Tencent_4 p = new Tencent_4();
        p.reverse(1534236469);
    }

    public int reverse(int x) {
        int res = 0, pop = 0;
        while (x != 0){
            pop = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            res = res * 10 + pop;
        }
        return res;
    }
}
