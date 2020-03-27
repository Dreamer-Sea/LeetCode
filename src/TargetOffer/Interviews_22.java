package TargetOffer;

import bean.ListNode;

public class Interviews_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        int len = 0;
        ListNode p = head;
        while (p != null){
            p = p.next;
            len++;
        }
        if (len < k) return null;
        p = head;
        for (int i = 0; i < len - k; i++){
            p = p.next;
        }
        return p;
    }
}
