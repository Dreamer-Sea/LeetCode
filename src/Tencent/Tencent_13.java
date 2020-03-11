package Tencent;

import bean.ListNode;

public class Tencent_13 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return split(lists, 0, lists.length-1);
    }

    private ListNode split(ListNode[] lists, int left, int right){
        if (left >= right) return lists[left];
        int mid = (left + right) >> 1;
        ListNode lNode = split(lists, left, mid);
        ListNode rNode = split(lists, mid+1, right);
        return merge(lNode, rNode);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        if (l1.val < l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        }else{
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
