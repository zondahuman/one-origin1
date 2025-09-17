package com.abin.algo.review.l2509.l0906;

import java.util.PriorityQueue;

/**
 * 23. 合并 K 个升序链表
 */
public class L23 {

    /**
     * 给你一个链表数组，每个链表都已经按升序排列。
     * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode dummy = new ListNode(-1), p = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(a.val-b.val));
        for(ListNode node :lists){
            if(null != node)
                pq.offer(node);
        }
        while(!pq.isEmpty()){
            ListNode listNode = pq.poll();
            p.next = listNode;
            if(listNode.next != null)
                pq.offer(listNode.next);
            p = p.next;
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
