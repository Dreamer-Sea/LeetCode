import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_15 {

    public static void main(String[] args) {
        LeetCode_15 p = new LeetCode_15();
        List<List<Integer>> res = new ArrayList<>();
        res = p.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List list : res)
            System.out.println(list);
    }

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int L = i + 1, R = len - 1;
            while (L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L+1]) L++;
                    while (L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }else if (sum > 0) R--;
                else L++;
            }
        }
        return res;
    }
}
