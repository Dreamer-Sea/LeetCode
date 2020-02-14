package TargetOffer;

import bean.TreeNode;

public class TargetOffer_26 {

    private TreeNode head, realHead;

    public TreeNode Convert(TreeNode root) {
        if (root == null) return null;
        dfs(root);
        return realHead;
    }

    private void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        if (head == null){
            head = root;
            realHead = root;
        }else{
            head.right = root;
            root.left = head;
            head = root;
        }
        dfs(root.right);
    }
}
