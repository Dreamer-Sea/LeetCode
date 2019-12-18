import java.util.ArrayList;
import java.util.List;

public class LeetCode_102 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<List<Integer>> res, int level){
        if (root == null) return;
        if (res.size() == level) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        dfs(root.left, res, level+1);
        dfs(root.right, res, level+1);
    }
}
