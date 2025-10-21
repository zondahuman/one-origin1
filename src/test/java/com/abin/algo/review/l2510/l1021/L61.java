package com.abin.algo.review.l2510.l1021;
/**
 * 61. 旋转链表
 */
public class L61 {

    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(null == head || null == head.next || k == 0) return head;
        ListNode cur = head;
        int n = 1;
        while (cur.next != null) {
            cur = cur.next;
            n++;
        }
        int add = n-k%n;
        cur.next = head;
        while(add-->0){
            cur = cur.next;
        }
        ListNode result = cur.next;
        cur.next = null;
        return result;
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
