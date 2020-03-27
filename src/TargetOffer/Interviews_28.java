package TargetOffer;

import bean.TreeNode;

public class Interviews_28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
