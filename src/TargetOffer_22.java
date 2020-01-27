import java.util.ArrayList;
import java.util.LinkedList;

public class TargetOffer_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> tmp = new LinkedList<>();
        tmp.add(root);
        while (!tmp.isEmpty()){
            TreeNode t = tmp.remove();
            res.add(t.val);
            if (t.left != null){
                tmp.add(t.left);
            }
            if (t.right != null){
                tmp.add(t.right);
            }
        }
        return res;
    }
}
