package TargetOffer;

import bean.ListNode;

public class TargetOffer_56 {
    public ListNode deleteDuplication(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, cur = dummy.next;
        int val;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                val = cur.val;
                while (cur != null && cur.val == val) cur = cur.next;
                pre.next = cur;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
