package TargetOffer;

public class Interviews_65 {
    public int add(int a, int b) {
        int tmp;
        while (a != 0){
            tmp = a ^ b;
            a = (a & b) << 1;
            b = tmp;
        }
        return b;
    }
}
