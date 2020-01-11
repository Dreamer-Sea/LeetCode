public class LeetCode_4 {

    private int inIdx, preIdx;

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        preIdx = 0;
        inIdx = 0;
        return build(pre, in, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] pre, int[] in, int stop){
        if (preIdx >= pre.length) return null;
        if (in[inIdx] == stop){
            inIdx++;
            return null;
        }
        TreeNode node = new TreeNode(pre[preIdx++]);
        node.left = build(pre, in, node.val);
        node.right = build(pre, in, stop);
        return node;
    }
}
