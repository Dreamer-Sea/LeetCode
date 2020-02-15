package TargetOffer;

import bean.ListNode;

public class TargetOffer_55 {
    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head == null) return head;
        boolean flag = false;
        ListNode fast = head, slow = head;
        while (fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
