package TargetOffer;

import bean.TreeNode;

public class Interviews_7 {

    private int preIdx, inIdx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop){
        if (preIdx >= preorder.length) return null;
        if (inorder[inIdx] == stop){
            inIdx++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[preIdx++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;
    }
}
