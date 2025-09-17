package com.abin.algo.review.l2509.l0917;

import java.util.List;

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
        if(null == head || head.next == null || k==0) return head;
        ListNode p=head;
        int n =1;
        while(null != p.next){
            n++;
            p=p.next;
        }
        int add = n-k%n;
        if(add == n)
            return head;
        p.next = head;
        while(add-->0){
            p = p.next;
        }
        ListNode result = p.next;
        p.next = null;
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
