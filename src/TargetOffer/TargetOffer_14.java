package TargetOffer;

import bean.ListNode;

public class TargetOffer_14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 0) return null;
        ListNode p = head;
        int count = 0;
        while (p != null){
            p = p.next;
            count++;
        }
        p = head;
        if (k > count) return null;
        for (int i = 0; i < count - k; i++){
            p = p.next;
        }
        return p;
    }
}
