package com.abin.algo.review.l2509.l0930;

/**
 * 1669. 合并两个链表
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
        ListNode front = list1;
        for (int i = 0; i <a-1 ; i++) {
            front = front.next;
        }
        ListNode back = front;
        for (int i = 0; i <b-a+2 ; i++) {
            back = back.next;
        }
        front.next = list2;
        while(null != list2.next){
            list2 = list2.next;
        }
        list2.next = back;
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
