package Tencent;

import java.util.ArrayList;
import java.util.List;

public class Tencent_17 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        backtracking(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtracking(List<List<Integer>> res, List<Integer> tmp, int[] nums, int idx){
        if (idx == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = idx; i < nums.length; i++){
            tmp.add(nums[i]);
            swap(nums, i, idx);
            backtracking(res, tmp, nums, idx+1);
            swap(nums, i, idx);
            tmp.remove(tmp.size() - 1);
        }
    }

    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
