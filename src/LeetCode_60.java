import java.util.ArrayList;

public class LeetCode_60 {
    public String getPermutation(int n, int k){
        ArrayList<Integer> nums = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
            nums.add(i);
        }
        k--;
        for (int i = 0; i < n; i++){
            fact /= (n - i);
            int idx = k / fact;
            builder.append(nums.remove(idx));
            k -= idx * fact;
        }
        return builder.toString();
    }
}
