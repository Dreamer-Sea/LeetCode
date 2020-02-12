package TargetOffer;

import bean.ListNode;

import java.util.ArrayList;

public class TargetOffer_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        if (head == null) return res;
        while (head != null){
            res.add(0, head.val);
            head = head.next;
        }
        return res;
    }
}
