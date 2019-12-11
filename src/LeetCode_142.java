public class LeetCode_142 {

    public ListNode detectCycle(ListNode head){
        ListNode fast = head, slow = head;
        boolean flag = false;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
