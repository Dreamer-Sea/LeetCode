package TargetOffer;

import bean.TreeNode;

public class TargetOffer_38 {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return (left > right ? left : right) + 1;
    }
}