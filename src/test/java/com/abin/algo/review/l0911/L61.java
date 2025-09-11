package com.abin.algo.review.l0911;

/**
 * 61. 旋转链表
 */
public class L61 {

    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * 先计算出来链表节点数n，然后算出来k的位置，把链表头尾连接起来，最后断开头
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(null == head) return null;
        int n = 1;
        ListNode listNode = head;
        while(null != listNode.next){
            listNode = listNode.next;
            n++;
        }
        int add = n - k%n;
        if(add == n){
            return head;
        }
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
