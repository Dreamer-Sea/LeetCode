package Tencent;

import bean.ListNode;

public class Tencent_32 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        boolean flag = false;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
