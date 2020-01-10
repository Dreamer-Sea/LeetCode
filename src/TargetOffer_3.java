import java.util.ArrayList;

public class TargetOffer_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        while (listNode != null){
            res.add(0, listNode.val);
            listNode = listNode.next;
        }
        return res;
    }
}
