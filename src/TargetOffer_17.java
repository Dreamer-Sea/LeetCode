public class TargetOffer_17 {
    public boolean HasSubtree(TreeNode r1,TreeNode r2) {
        if (r2 == null) return false;
        if (r1 == null && r2 != null) return false;
        boolean flag = false;
        if (r1.val == r2.val){
           flag = isSubtree(r1.left, r2.left) && isSubtree(r1.right, r2.right);
           if (!flag){
               flag = HasSubtree(r1.left, r2);
               if (!flag){
                   flag = HasSubtree(r1.right, r2);
               }
           }
        }
        return flag;
    }

    private boolean isSubtree(TreeNode r1, TreeNode r2){
        if (r2 == null) return true;
        if (r1 == null && r2 != null) return false;
        if (r1.val == r2.val){
            return isSubtree(r1.left, r2.left) && isSubtree(r1.right, r2.right);
        }
        return false;
    }
}
