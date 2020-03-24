package LeetCode;

import bean.TreeNode;

public class LeetCode_106 {

    private int inIdx, postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inIdx = inorder.length - 1; postIdx = postorder.length - 1;
        return build(inorder, postorder, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] inorder, int[] postorder, int stop){
        if (postIdx < 0) return null;
        if (inorder[inIdx] == stop){
            inIdx--;
            return null;
        }
        TreeNode node = new TreeNode(postorder[postIdx--]);
        node.right = build(inorder, postorder, node.val);
        node.left = build(inorder, postorder, stop);
        return node;
    }
}
