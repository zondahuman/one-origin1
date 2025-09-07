package com.abin.algo.review.l0906;

/**
 * 25. K 个一组翻转链表
 */
public class L25 {


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode a = head, b = head;
        ListNode p = dummy;
        for (int i = 0; i <k ; i++) {
            if(b == null)
                return head;
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    ListNode reverse(ListNode a, ListNode b){
        ListNode pre = null;
        ListNode cur = a;
        ListNode nxt = a;
        while(cur != b){
            nxt = cur.next;
            cur.next = pre;
            pre = cur ;
            cur = nxt;
        }
        return pre;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
