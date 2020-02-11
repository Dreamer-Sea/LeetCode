import java.util.ArrayList;

public class TargetOffer_51 {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) return A;
        int[] before = new int[A.length], after = new int[A.length];
        before[0] = 1;
        after[A.length - 1] = 1;
        for (int i = 1; i < before.length; i++) {
            before[i] = before[i - 1] * A[i - 1];
        }
        for (int i = A.length - 2; i >= 0; i--) {
            after[i] = after[i + 1] * A[i + 1];
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = before[i] * after[i];
        }
        return res;
    }
}
