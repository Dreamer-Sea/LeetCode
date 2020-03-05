package Tencent;

import bean.ListNode;

public class Tencent_45 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
