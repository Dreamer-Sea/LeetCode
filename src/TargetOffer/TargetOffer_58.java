package TargetOffer;

import bean.TreeNode;

public class TargetOffer_58 {
    public boolean isSymmetrical(TreeNode root) {
        if (root == null) return true;
        return isSymmetrical(root.left, root.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val){
            return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
        }
        return false;
    }
}
