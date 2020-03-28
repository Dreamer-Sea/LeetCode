package TargetOffer;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Interviews_32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        addNodes(root, res, 0);
        return res;
    }

    private void addNodes(TreeNode root, List<List<Integer>> res, int level){
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        addNodes(root.left, res, level+1);
        addNodes(root.right, res, level+1);
    }
}
