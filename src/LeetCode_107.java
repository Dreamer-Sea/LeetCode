import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, res, 0);
        Collections.reverse(res);
        return res;
    }

    private void dfs(TreeNode root, List<List<Integer>> res, int level){
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        dfs(root.left, res, level+1);
        dfs(root.right, res, level+1);
    }
}
