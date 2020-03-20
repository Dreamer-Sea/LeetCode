package Tencent;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Tencent_42 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        List<TreeNode> nodes = new ArrayList<>();
        addNode(root, nodes);
        return nodes.get(k-1).val;
    }

    private void addNode(TreeNode node, List<TreeNode> nodes){
        if (node == null) return;
        addNode(node.left, nodes);
        nodes.add(node);
        addNode(node.right, nodes);
    }
}
