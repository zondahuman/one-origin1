package com.abin.algo.review.l26.l2604.l0408;

import java.util.PriorityQueue;

/**
 * 23. 合并 K 个升序链表
 * https://leetcode.cn/problems/merge-k-sorted-lists/description/
 */
public class L23 {
    /**
     * 给你一个链表数组，每个链表都已经按升序排列。
     * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        if(0 == lists.length) return null;
        PriorityQueue<ListNode>  pq = new PriorityQueue<>((a,b)->(a.val-b.val));
        for(ListNode listNode:lists){
            if(null != listNode)
                pq.offer(listNode);
        }
        ListNode node = dummy;
        while(!pq.isEmpty()){
            ListNode listNode = pq.poll();
            node.next = listNode;
            if(listNode.next != null){
                pq.offer(listNode.next);
            }
            node = node.next;
        }
        return dummy.next;
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
