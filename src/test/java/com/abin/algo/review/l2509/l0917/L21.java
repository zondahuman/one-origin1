package com.abin.algo.review.l2509.l0917;

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
        ListNode dummy1 = list1, dummy2 = list2;
        ListNode p1 = dummy1, p2=dummy2;
        ListNode dummy = new ListNode(-1),p=dummy;
        while(null != p1 && null != p2){
            if(p1.val<p2.val){
                p.next = p1;
                p1=p1.next;
            }else{
                p.next =p2;
                p2=p2.next;
            }
            p=p.next;
        }
        if(null != p1)
            p.next = p1;
        if(null!=p2)
            p.next=p2;
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
