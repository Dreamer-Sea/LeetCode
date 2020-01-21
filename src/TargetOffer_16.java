public class TargetOffer_16 {
    public ListNode Merge(ListNode h1, ListNode h2) {
        if (h1 == null && h2 == null) return null;
        if (h1 == null) return h2;
        if (h2 == null) return h1;
        ListNode dummy = new ListNode(-1), p = dummy;
        while (h1 != null && h2 != null){
            if (h1.val < h2.val){
                p.next = h1;
                h1 = h1.next;
            }else{
                p.next = h2;
                h2 = h2.next;
            }
            p = p.next;
        }
        if (h1 == null) p.next = h2;
        else p.next = h1;
        return dummy.next;
    }
}
