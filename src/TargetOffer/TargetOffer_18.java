package TargetOffer;

import bean.TreeNode;

public class TargetOffer_18 {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        Mirror(root.left);
        Mirror(root.right);
    }
}
