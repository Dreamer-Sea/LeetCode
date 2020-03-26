package TargetOffer;

import bean.ListNode;

public class Interviews_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        while (p.next != null){
            if (p.next.val == val){
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
