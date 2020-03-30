package TargetOffer;

import bean.TreeNode;

public class Interviews_54 {

    private int count;
    private int res;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root == null)return;
        dfs(root.right);
        if(count == 1){
            res = root.val;
            count--;
            return;
        }
        count--;
        dfs(root.left);
    }
}
