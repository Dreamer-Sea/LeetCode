package Tencent;

import java.util.ArrayList;
import java.util.List;

public class Tencent_24 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = subsets(nums);
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        backtracking(nums, res, new ArrayList<>(), 0);
        return res;
    }

    private static void backtracking(int[] nums, List<List<Integer>> res, List<Integer> tmp, int idx){
        res.add(new ArrayList<>(tmp));
        for (int i = idx; i < nums.length; i++){
            tmp.add(nums[i]);
            backtracking(nums, res, tmp, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
