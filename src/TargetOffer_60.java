import java.util.ArrayList;

public class TargetOffer_60 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(res, root, 0);
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>> res, TreeNode root, int level){
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        dfs(res, root.left, level+1);
        dfs(res, root.right, level+1);
    }
}
