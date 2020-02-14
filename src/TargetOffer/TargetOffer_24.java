package TargetOffer;

import bean.TreeNode;

import java.util.ArrayList;

public class TargetOffer_24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(res, new ArrayList<>(), root, target);
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, TreeNode root, int target){
        if (root == null || root.val > target) return;
        target -= root.val;
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }else{
            dfs(res, list, root.left, target);
            dfs(res, list, root.right, target);
        }
        list.remove(list.size()-1);
    }
}
