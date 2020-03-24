package LeetCode;

import bean.TreeNode;

public class LeetCode_105 {

    private int preIdx, inIdx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIdx = 0; inIdx = 0;
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
