public class TargetOffer_36 {
    public ListNode FindFirstCommonNode(ListNode h1, ListNode h2) {
        if (h1 == null || h2 == null) return null;
        ListNode a = h1, b = h2;
        while (a != b){
            a = a == null ? h2 : a.next;
            b = b == null ? h1 : b.next;
        }
        return a;
    }
}
