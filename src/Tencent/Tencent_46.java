package Tencent;

import bean.ListNode;

public class Tencent_46 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
