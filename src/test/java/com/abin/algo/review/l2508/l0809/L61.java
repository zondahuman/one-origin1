package com.abin.algo.review.l2508.l0809;


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
        if(null == head || null == head.next || 0 == k)  return head;
        int n = 1;
        ListNode listNode = head;
        while(null != listNode.next){
            listNode = listNode.next;
            n++;
        }
        int add = n - k%n;
        if(add == n)
            return head;
        listNode.next = head;
        while(add-->0){
            listNode = listNode.next ;
        }
        ListNode result = listNode.next;
        listNode.next = null;
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




