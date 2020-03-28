package TargetOffer;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Interviews_34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        sum(root, res, new ArrayList<>(), sum);
        return res;
    }

    private void sum(TreeNode root, List<List<Integer>> res, List<Integer> path, int sum){
        if (root == null || root.val > sum) return;
        sum -= root.val;
        path.add(root.val);
        if (root.left == null && root.right == null && sum == 0)
            res.add(new ArrayList<>(path));
        sum(root.left, res, path, sum);
        sum(root.right, res, path, sum);
        path.remove(path.size()-1);
    }
}
