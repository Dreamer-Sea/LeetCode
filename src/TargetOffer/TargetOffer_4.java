package TargetOffer;

import bean.TreeNode;

public class TargetOffer_4 {

    public static void main(String[] args) {
        TargetOffer_4 p = new TargetOffer_4();
        int[] pre = {1,2,4,7,3,5,6,8}, in = {4,7,2,1,5,3,8,6};
        p.reConstructBinaryTree(pre, in);
    }


    private int preIdx = 0, inIdx = 0;

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0 || in == null || in.length == 0 || pre.length != in.length) return null;
        TreeNode node = construct(pre, in, Integer.MIN_VALUE);
        return node;
    }

    private TreeNode construct(int[] pre, int[] in, int stop){

        if (preIdx >= pre.length) return null;

        if (in[inIdx] == stop){
            inIdx++;
            return null;
        }
        TreeNode node = new TreeNode(pre[preIdx++]);
        node.left = construct(pre, in, node.val);
        node.right = construct(pre, in, stop);
        return node;
    }
}
