package TargetOffer;

import bean.Node;

public class Interviews_35 {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node p = head;
        while (p != null){
            Node clone = new Node(p.val);
            clone.next = p.next;
            p.next = clone;
            p = p.next.next;
        }
        p = head;
        while (p != null){
            p.next.random = p.random == null ? null : p.random.next;
            p = p.next.next;
        }
        p = head;
        Node newHead = head.next, newP = newHead;
        while (p != null){
            p.next = p.next == null ? null : p.next.next;
            p = p.next;
            newP.next = newP.next == null ? null : newP.next.next;
            newP = newP.next;
        }
        return newHead;
    }
}
