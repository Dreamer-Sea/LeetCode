public class LeetCode_147 {

    public ListNode insertionSortList(ListNode head){
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode pre = dummy, tail = dummy, cur = head;
        while (cur != null){
            if (tail.val < cur.val){
                tail.next = cur;
                tail = cur;
                cur = cur.next;
            }else{
                ListNode tmp = cur.next;
                tail.next = tmp;
                while (pre != null && pre.next.val < cur.val) pre = pre.next;
                cur.next = pre.next;
                pre.next = cur;
                pre = dummy;
                cur = tmp;
            }
        }
        return dummy.next;
    }
}
