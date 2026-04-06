package com.abin.algo.review.l26.l2604.l0406;

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
        if(0 == lists.length) return null;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy ;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length,(a,b)->(a.val-b.val));
        for(ListNode temp:lists){
            if(null != temp)
                pq.offer(temp);
        }
        while(!pq.isEmpty()){
            // 获取最小节点，接到结果链表中
            ListNode listNode = pq.poll();
            p.next = listNode;
            if(null != listNode.next){
                pq.offer(listNode.next);
            }
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
