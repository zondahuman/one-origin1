package com.abin.algo.review.l0805;

/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class L61 {
    /**
     * k%n： 是否会重复循环
     * n -k%n：计算尾节点的位置
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (null == head || k ==0 || head.next == null) return null;
        ListNode listNode = head;
        int n = 1;
        while(null != listNode.next){
            listNode = listNode.next;
            n++;
        }
        int add = n -k%n;
        if(add == n)
            return head;
        listNode.next = head;
        while(add-->0){
            listNode = listNode.next;
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
