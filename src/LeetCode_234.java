public class LeetCode_234 {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null) return true;

        ListNode fast = head.next, slow = head, pre = null, prepre = null;
        while (fast != null && fast.next != null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
            pre.next = prepre;
            prepre = pre;
        }
        ListNode n2 = slow.next;
        slow.next = pre;
        ListNode n1 = fast == null ? slow.next : slow;
        while (n1 != null && n2 != null){
            if (n1.val != n2.val) return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }
}
