package com.abin.algo.review.l26.l2604.l0408;

/**
 * 1669. 合并两个链表
 * https://leetcode.cn/problems/merge-in-between-linked-lists/description/
 */
public class L1669 {
    /**
     * 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
     * 请你将 list1 中下标从 a 到 b 的全部节点都删除，并将list2 接在被删除节点的位置。
     * @param list1
     * @param a
     * @param b
     * @param list2
     * @return
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1;
        for (int i = 0; i <a-1 ; i++) {
            pre = pre.next;
        }
        ListNode post = pre;
        for (int i = 0; i <b-a+2 ; i++) {
            post=post.next;
        }
        pre.next = list2;
        while(null != list2.next){
            list2 = list2.next;
        }
        list2.next = post;
        return list1;
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
