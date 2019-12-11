import java.util.*;

public class LeetCode_148 {

    public static void main(String[] args) {
        LeetCode_148 p = new LeetCode_148();
        ListNode head = new ListNode(4), pointer = head;

        pointer.next = new ListNode(2);
        pointer = pointer.next;
        pointer.next = new ListNode(1);
        pointer = pointer.next;
        pointer.next = new ListNode(3);

        p.sortList(head);
    }

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
        ListNode res = new ListNode(0), h = res;
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
        h.next = left != null ? left : right;
        return res.next;
    }
}
