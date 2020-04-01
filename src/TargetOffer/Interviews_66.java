package TargetOffer;

public class Interviews_66 {
    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) return new int[0];
        int[] before = new int[a.length], after = new int[a.length];
        before[0] = 1; after[a.length-1] = 1;
        for (int i = 1; i < before.length; i++) before[i] = before[i-1] * a[i-1];
        for (int i = after.length-2; i >= 0; i--) after[i] = after[i+1] * a[i+1];
        for (int i = 0; i < a.length; i++) before[i] *= after[i];
        return before;
    }
}
