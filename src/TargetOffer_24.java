import java.util.ArrayList;

public class TargetOffer_24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null || target <= 0) return res;
        backtracking(res, root, target, new ArrayList<>());
        return res;
    }

    private void backtracking(ArrayList<ArrayList<Integer>> res, TreeNode root, int target, ArrayList<Integer> tmp){
        if (root == null) return;
        if (root.val > target) return;
        target -= root.val;
        tmp.add(root.val);
        if (root.left == null && root.right == null && target == 0){
            res.add(new ArrayList<>(tmp));
        }else{
            backtracking(res, root.left, target, tmp);
            backtracking(res, root.right, target, tmp);
        }
        tmp.remove(tmp.size()-1);
    }
}
