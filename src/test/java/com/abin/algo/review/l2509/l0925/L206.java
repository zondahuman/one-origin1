package com.abin.algo.review.l2509.l0925;

/**
 * 206. 反转链表
 */
public class L206 {

    /**
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(null == head || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
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
