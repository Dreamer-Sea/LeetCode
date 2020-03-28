package TargetOffer;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

public class Interviews_36 {

    public Node pre;
    public Node head, tail;

    public void process(Node root){
        if(root == null){
            return;
        }
        process(root.left);
        root.left = pre;
        if(pre == null){
            head = root;
        }else{
            pre.right = root;
        }
        pre = root;
        tail = root;
        process(root.right);
    }
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        process(root);
        tail.right = head;
        head.left = tail;
        return head;
    }
}
