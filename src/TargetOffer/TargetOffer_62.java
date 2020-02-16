package TargetOffer;

import bean.TreeNode;

import java.util.ArrayList;

public class TargetOffer_62 {
    public TreeNode KthNode(TreeNode root, int k) {
        if (root == null || k < 1) return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        addNode(root, list);
        if (k > list.size()) return null;
        return list.get(k-1);
    }

    private void addNode(TreeNode node, ArrayList<TreeNode> list){
        if (node == null) return;
        addNode(node.left, list);
        list.add(node);
        addNode(node.right, list);
    }
}
