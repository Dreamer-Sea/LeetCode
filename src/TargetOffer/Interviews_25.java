package TargetOffer;

import bean.ListNode;

public class Interviews_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode dummy = new ListNode(-1), p = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 == null) p.next = l2;
        if (l2 == null) p.next = l1;
        return dummy.next;
    }
}
