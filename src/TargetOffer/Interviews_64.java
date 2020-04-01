package TargetOffer;

public class Interviews_64 {
    public int sumNums(int n) {
        if (n == 0) return 0;
        return sumNums(n-1) + 1;
    }
}
