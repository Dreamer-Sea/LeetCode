package Tencent;

import bean.ListNode;

public class Tencent_34 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode lNode = sortList(head);
        ListNode rNode = sortList(tmp);
        ListNode dummy = new ListNode(-1), p = dummy;
        while (lNode != null && rNode != null){
            if (lNode.val < rNode.val){
                p.next = new ListNode(lNode.val);
                lNode = lNode.next;
            }else{
                p.next = new ListNode(rNode.val);
                rNode = rNode.next;
            }
            p = p.next;
        }
        if (lNode == null) p.next = rNode;
        if (rNode == null) p.next = lNode;
        return dummy.next;
    }
}
