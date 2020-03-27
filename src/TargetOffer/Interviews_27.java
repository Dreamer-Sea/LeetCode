package TargetOffer;

import bean.TreeNode;

public class Interviews_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
