public class LeetCode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1), p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
        }

        return dummy.next;
    }
}
