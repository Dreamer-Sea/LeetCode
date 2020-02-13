package TargetOffer;

import bean.ListNode;

public class TargetOffer_15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = null, next;
        while (head != null){
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
