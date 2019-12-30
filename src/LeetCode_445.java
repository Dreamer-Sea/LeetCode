import java.util.*;

public class LeetCode_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Stack<Integer> n1 = new Stack<>();
        Stack<Integer> n2 = new Stack<>();
        while (l1 != null) {
            n1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            n2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = null;
        while (!n1.isEmpty() || !n2.isEmpty() || carry != 0){
            int sum = 0;
            if (!n1.isEmpty()) sum += n1.pop();
            if (!n2.isEmpty()) sum += n2.pop();
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }
        return head;
    }
}
