package com.abin.algo.review.l0906;

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
        if(null == head) return null;
        ListNode node = head;
        int n = 1;
        while(node.next != null){
            n++;
            node = node.next;
        }
        int add = n - k%n;
        if(add == n)
            return head;
        node.next = head;
        while(add-->0){
            node = node.next;
        }
        ListNode result = node.next;
        node.next = null;
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
