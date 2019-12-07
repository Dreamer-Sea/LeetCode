import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class LeetCode_60 {

    public static void main(String[] args) {
        LeetCode_60 p = new LeetCode_60();
        System.out.println(p.getPermutation(3, 2));
    }

    public String getPermutation(int n, int k){
        List<Integer> num = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
            num.add(i);
        }
        k--;
        for (int i = 0; i < n; i++){
            fact /= (n - i);
            int idx = (k / fact);
            builder.append(num.remove(idx));
            k -= idx * fact;
        }
        return builder.toString();
    }
}
