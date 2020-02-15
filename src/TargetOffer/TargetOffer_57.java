package TargetOffer;

import bean.TreeLinkNode;

public class TargetOffer_57 {
    public TreeLinkNode GetNext(TreeLinkNode node){
        if (node == null) return node;
        if (node.right != null){
            node = node.right;
            while (node.left != null && node.right != null){
                node = node.left;
            }
            return node;
        }
        while (node.next != null){
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;
    }
}
