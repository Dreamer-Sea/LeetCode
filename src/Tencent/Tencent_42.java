package Tencent;

public class Tencent_42 {

    public static void main(String[] args) {
        isPowerOfTwo(0);
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
