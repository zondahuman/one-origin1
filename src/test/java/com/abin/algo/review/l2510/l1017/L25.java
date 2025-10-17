package com.abin.algo.review.l2510.l1017;

import com.abin.algo.review.l2510.l1011.L1669;

/**
 * 25. K 个一组翻转链表
 */
public class L25 {


    /**
     * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
     * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
     * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = head, b= head;
        for (int i = 0; i <k ; i++) {
            if(null == b) return head;
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
            nxt = cur.next ;
            cur.next = pre;
            pre = cur;
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
