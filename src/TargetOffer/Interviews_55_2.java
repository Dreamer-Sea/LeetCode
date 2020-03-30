package TargetOffer;

import bean.TreeNode;

public class Interviews_55_2 {

    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        dfs(root);
        return flag;
    }

    private int dfs(TreeNode root){
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) flag = false;
        return Math.max(left, right) + 1;
    }
}
