package Tencent;

import bean.TreeNode;

public class LeetCode_43 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val, pVal = p.val, qVal = q.val;
        if (parentVal < pVal && parentVal < qVal){
            return lowestCommonAncestor(root.right, p, q);
        }else if (parentVal > pVal && parentVal > qVal){
            return lowestCommonAncestor(root.left, p, q);
        }
        else return root;
    }
}
