public class LeetCode_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        int parentVal = root.val, pVal = p.val, qVal = q.val;
        if (pVal < parentVal && qVal < parentVal) return lowestCommonAncestor(root.left, p, q);
        else if (pVal > parentVal && qVal > parentVal) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}
