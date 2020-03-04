package Tencent;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Tencent_41 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        List<Integer> nodes = new ArrayList<>();
        addNode(root, nodes);
        return nodes.get(k-1);
    }

    private void addNode(TreeNode root, List<Integer> nodes){
        if (root == null) return;
        addNode(root.left, nodes);
        nodes.add(root.val);
        addNode(root.right, nodes);
    }
}
