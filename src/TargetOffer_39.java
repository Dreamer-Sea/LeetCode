public class TargetOffer_39 {

    private boolean flag = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        dfs(root);
        return flag;
    }

    private int dfs(TreeNode root){
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1){
            flag = false;
        }
        return (left > right ? left : right) + 1;
    }
}
