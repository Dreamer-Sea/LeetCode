package TargetOffer;

import bean.TreeNode;

public class Interviews_37 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "#";
            StringBuilder builder = new StringBuilder();
            serialize(root, builder);
            return builder.toString();
        }

        private void serialize(TreeNode root, StringBuilder builder){
            if (root == null){
                builder.append("#,");
                return;
            }
            builder.append(root.val + ",");
            serialize(root.left, builder);
            serialize(root.right, builder);
        }

        private int i = 0;

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) return null;
            return deserialize(data.split(","));
        }

        private TreeNode deserialize(String[] strs){
            if ("#".equals(strs[i])){
                i++;
                return null;
            }
            TreeNode node = new TreeNode(Integer.valueOf(strs[i++]));
            node.left = deserialize(strs);
            node.right = deserialize(strs);
            return node;
        }
    }
}
