package Tencent;

import bean.ListNode;

public class Tencent_21 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode p = head;
        int len = 0;
        while (p != null){
            p = p.next;
            len++;
        }
        k %= len;
        if (k == 0) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, cur = dummy;
        while (k > 0){
            cur = cur.next;
            k--;
        }
        while (cur != null && cur.next != null){
            pre = pre.next;
            cur = cur.next;
        }
        dummy.next = pre.next;
        pre.next = null;
        cur.next = head;
        return dummy.next;
    }
}
