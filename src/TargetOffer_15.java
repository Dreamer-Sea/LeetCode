public class TargetOffer_15 {

    // 迭代
    public ListNode ReverseList(ListNode head) {
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

    // 递归
    public ListNode ReverseList1(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList1(next);
        next.next = head;
        return newHead;
    }
}
