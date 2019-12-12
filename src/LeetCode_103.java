import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, TreeNode root, int depth){
        if (root == null) return;
        if (res.size() == depth) res.add(new LinkedList<>());
        if (depth % 2 == 0) res.get(depth).add(root.val);
        else res.get(depth).add(0, root.val);
        helper(res, root.left, depth+1);
        helper(res, root.right, depth+1);
    }
}
