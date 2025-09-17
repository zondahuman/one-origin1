package com.abin.algo.review.l2509.l0914;

/**
 * 21. 合并两个有序链表
 */
public class L21 {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        while(null != list1 && null != list2){
            if(list1.val<=list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next ;
            }
            p = p.next;
        }
        if(null != list1)
            p.next = list1 ;
        if(null != list2)
            p.next = list2;
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
