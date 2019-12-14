import java.util.Stack;

public class LeetCode_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode p = l1;
        while (p != null){
            s1.push(p.val);
            p = p.next;
        }
        p = l2;
        while (p != null){
            s2.push(p.val);
            p = p.next;
        }
        ListNode head = null;
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            node.next = head;
            head = node;
        }
        return head;
    }
}
