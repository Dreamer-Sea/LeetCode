package Tencent;

import bean.TreeNode;

public class Tencent_29 {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        gainMax(root);
        return max;
    }

    private int gainMax(TreeNode node){
        if (node == null) return 0;
        int left = Math.max(gainMax(node.left), 0);
        int right = Math.max(gainMax(node.right), 0);
        int sum = left + right + node.val;
        if (sum > max) max = sum;
        return node.val + Math.max(left, right);
    }
}
