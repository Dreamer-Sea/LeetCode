import java.util.ArrayList;
import java.util.List;

public class LeetCode_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<List<Integer>> res, int level){
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        if (level % 2 == 0){
            res.get(level).add(root.val);
        }else{
            res.get(level).add(0, root.val);
        }
        dfs(root.left, res, level+1);
        dfs(root.right, res, level+1);
    }
}
