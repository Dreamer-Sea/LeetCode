package Tencent;

import java.util.ArrayList;
import java.util.List;

public class Tencent_24 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        backtracking(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtracking(List<List<Integer>> res, List<Integer> tmp, int[] nums, int idx){
        res.add(new ArrayList<>(tmp));
        for (int i = idx; i < nums.length; i++){
            tmp.add(nums[i]);
            backtracking(res, tmp, nums, i+1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
