public class TargetOffer_26 {

    private TreeNode head, realHead;

    public TreeNode Convert(TreeNode root) {
        if (root == null) return null;
        converSub(root);
        return realHead;
    }

    private void converSub(TreeNode root){
        if (root == null) return;
        converSub(root.left);
        if (head == null){
            head = root;
            realHead = root;
        }else{
            head.right = root;
            root.left = head;
            head = root;
        }
        converSub(root.right);
    }
}
