package com.abin.algo.review.l2508.l0809;

/**
 * 86. 分隔链表
 */
public class L86 {
    /**
     * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
     * 你应当 保留 两个分区中每个节点的初始相对位置。
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if(null == head || head.next == null) return head;
        ListNode dummy1 = new ListNode(-1) ;
        ListNode dummy2 = new ListNode(-1) ;
        ListNode p1 = dummy1, p2 = dummy2;
        ListNode node = head;
        while(null != node){
            if(node.val < x){
                p1.next = node;
                p1 = p1.next;
            }else{
                p2.next = node;
                p2 = p2.next ;
            }

            ListNode temp = node.next;
            node.next = null;
            node = temp;
        }
        p1.next = dummy2.next;
        return dummy1.next;
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
