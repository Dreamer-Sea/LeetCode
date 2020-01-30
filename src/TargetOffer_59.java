import java.util.ArrayList;

public class TargetOffer_59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(res, root, 0);
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>> res, TreeNode root, int level){
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        if (level % 2 == 0){
            res.get(level).add(root.val);
        }else{
            res.get(level).add(0, root.val);
        }
        dfs(res, root.left, level+1);
        dfs(res, root.right, level+1);
    }
}
