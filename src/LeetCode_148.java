public class LeetCode_148 {
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode res = new ListNode(-1), h = res;
        while (left != null && right != null){
            if (left.val < right.val){
                h.next = left;
                left = left.next;
            }else{
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        if (left == null) h.next = right;
        if (right == null) h.next = left;

        return res.next;
    }
}
