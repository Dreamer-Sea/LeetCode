package Tencent;

import bean.ListNode;

public class Tencent_39 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = null;
        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
