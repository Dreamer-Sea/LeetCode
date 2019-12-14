import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_989 {
    public List<Integer> addToArrayForm(int[] A, int K){
        int N = A.length;
        List<Integer> res = new ArrayList<>();
        int cur = K, i = N;
        while (--i >= 0 || cur > 0){
             if (i >= 0) cur += A[i];
             res.add(cur % 10);
             cur /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}
