import java.util.Deque;

public class TargetOffer_61 {
    public String Serialize(TreeNode root) {
        if (root == null) return "#";
        StringBuilder builder = new StringBuilder();
        Serialize(root, builder);
        return builder.toString();
    }

    private void Serialize(TreeNode root, StringBuilder builder){
        if (root == null) {
            builder.append("#,");
            return;
        }
        builder.append(root.val);
        builder.append(",");
        Serialize(root.left, builder);
        Serialize(root.right, builder);
    }

    private int idx = 0;

    public TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
        return Deserialize(str.split(","));
    }

    private TreeNode Deserialize(String[] strs){
        if ("#".equals(strs[idx])){
            idx++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(strs[idx++]));
        node.left = Deserialize(strs);
        node.right = Deserialize(strs);
        return node;
    }
}
