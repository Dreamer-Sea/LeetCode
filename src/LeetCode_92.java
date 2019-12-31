public class LeetCode_92 {
    public ListNode reverseBetween(ListNode head, int m, int n){
        if (head == null || m >= n) return head;
        ListNode dummy = new ListNode(-1), pre = dummy;
        dummy.next = head;
        for (int i = 0; i < m - 1; i++){
            pre = pre.next;
        }
        ListNode cur = pre.next, post = cur.next;
        for (int i = 0; i < n - m; i++){
            cur.next = post.next;
            post.next = pre.next;
            pre.next = post;
            post = cur.next;
        }
        return dummy.next;
    }
}
