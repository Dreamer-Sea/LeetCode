import java.util.HashSet;
import java.util.Set;

public class LeetCode_128 {

    public static void main(String[] args) {
        LeetCode_128 p = new LeetCode_128();
        System.out.println(p.longestConsecutive(new int[]{1, 2, 0, 1}));;
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int max = 0;
        for (int n : nums){
            if (!set.contains(n-1)){
                int cur = n;
                int len = 1;
                while (set.contains(cur + 1)){
                    cur++;
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
