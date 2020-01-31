public class TargetOffer_25 {
    public RandomListNode Clone(RandomListNode head) {
        if (head == null) return null;
        RandomListNode p = head;
        while (p != null){
            RandomListNode newNode = new RandomListNode(p.label);
            newNode.next = p.next;
            p.next = newNode;
            p = p.next.next;
        }

        p = head;
        while (p != null){
            p.next.random = p.random == null ? null : p.random.next;
            p = p.next.next;
        }

        p = head;
        RandomListNode newHead = p.next, newP = newHead;
        while (p != null){
            p.next = p.next == null ? null : p.next.next;
            p = p.next;
            newP.next = newP.next == null ? null : newP.next.next;
            newP = newP.next;
        }
        return newHead;
    }
}
