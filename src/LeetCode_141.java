public class LeetCode_141 {
    public boolean hasCycle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode fast = head, slow = head;
        boolean flag = false;
        while (fast != null && fast.next != null){
            if (fast == slow){
                flag = true;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        if (!flag) return false;
        return true;
    }
}
