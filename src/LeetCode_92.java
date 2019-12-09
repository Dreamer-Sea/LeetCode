public class LeetCode_92 {
    public ListNode reverseBetween(ListNode head, int m, int n){
        if (head == null || m >= n) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < m - 1; i++){
            prev = prev.next;
        }

        ListNode cur = prev.next, post = cur.next;
        for (int i = 0; i < n - m; i++){
            cur.next = post.next;
            post.next = prev.next;
            prev.next = post;
            post = cur.next;
        }

        return dummy.next;
    }
}
