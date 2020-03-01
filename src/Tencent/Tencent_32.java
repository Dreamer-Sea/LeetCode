package Tencent;

import bean.ListNode;

public class Tencent_32 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        boolean flag = false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
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
