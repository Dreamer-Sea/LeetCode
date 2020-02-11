import java.util.ArrayList;

public class TargetOffer_62 {
    public TreeNode KthNode(TreeNode root, int k) {
        if (root == null || k < 1) return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        inorderTraverse(root, list);
        if (k > list.size()) return null;
        return list.get(k-1);
    }

    private void inorderTraverse(TreeNode root, ArrayList<TreeNode> list) {
        if (root != null){
            inorderTraverse(root.left, list);
            list.add(root);
            inorderTraverse(root.right, list);
        }
    }
}
