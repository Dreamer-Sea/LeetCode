package TargetOffer;

import bean.ListNode;

public class Interviews_24 {
    public ListNode reverseList(ListNode head) {
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
