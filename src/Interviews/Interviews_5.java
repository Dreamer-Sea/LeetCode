package Interviews;

import bean.TreeNode;

public class Interviews_5 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode node){
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }
}
