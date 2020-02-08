import java.util.ArrayList;
import java.util.Arrays;

public class TargetOffer_42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] nums, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int i = 0, j = nums.length - 1, tmp;
        while (i < j){
            tmp = nums[i] + nums[j];
            if (tmp == sum){
                res.add(nums[i]);
                res.add(nums[j]);
                return res;
            }
            if (tmp < sum) i++;
            else j--;
        }
        return res;
    }
}
