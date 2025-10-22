package com.abin.algo.review.l2510.l1021;

import java.util.Stack;

/**
 * 86. 分隔链表
 */
public class L86 {

    /**
     * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，
     * 使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
     * 你应当 保留 两个分区中每个节点的初始相对位置。
     * @param head
     * @param
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1, p2 = dummy2;
        ListNode node = head;
        while(null != node){
            if(node.val>=x){
                p2.next = new ListNode(node.val);
                p2 = p2.next;
            }else{
                p1.next = new ListNode(node.val);
                p1 = p1.next ;
            }
            ListNode next = node.next;
            node.next = null;
            node = next;
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
