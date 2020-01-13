public class TargetOffer_10 {
    public int RectCover(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++){
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
