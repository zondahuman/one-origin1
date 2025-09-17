package com.abin.algo.review.l2509.l0911;

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
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode p = head, p1 = a,p2=b;
        while(null != p){
            if(p.val<x){
                p1.next = p;
                p1= p1.next;
            }else{
                p2.next = p;
                p2 = p2.next;
            }
            ListNode next = p.next;
            p.next = null;
            p = next;
        }
        p1.next = b.next;
        return a.next;
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
