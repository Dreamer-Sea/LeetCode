package Tencent;

import bean.ListNode;

public class Tencent_21 {

    public static void main(String[] args) {
        ListNode dummy = new ListNode(-1), p = dummy;
        for (int i = 1; i <= 5; i++){
            p.next = new ListNode(i);
            p = p.next;
        }
        Tencent_21 t = new Tencent_21();
        t.rotateRight(dummy.next, 2);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
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
        ListNode pre = dummy, curr = dummy;
        while (k > 0){
            curr = curr.next;
            k--;
        }
        while (curr.next != null){
            pre = pre.next;
            curr = curr.next;
        }
        dummy.next = pre.next;
        curr.next = head;
        pre.next = null;
        return dummy.next;
    }
}
