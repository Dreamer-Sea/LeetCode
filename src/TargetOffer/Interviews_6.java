package TargetOffer;

import bean.ListNode;

import java.util.ArrayList;

public class Interviews_6 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int length = getLength(head);
        int[] result = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            result[i] = head.val;
            head = head.next;
        }
        return result;
    }

    private int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
