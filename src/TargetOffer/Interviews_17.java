package TargetOffer;

public class Interviews_17 {
    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        int count = 1;
        for (int i =0; i < res.length; i++){
            res[i] = count++;
        }
        return res;
    }
}
