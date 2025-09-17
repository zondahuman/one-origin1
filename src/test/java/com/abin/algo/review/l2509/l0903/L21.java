package com.abin.algo.review.l2509.l0903;

import com.abin.lee.algo.leetcode.questions.list.L148SortList;

/**
 * 21. 合并两个有序链表
 */
public class L21 {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1),p = dummy;
        ListNode p1 = list1, p2 = list2;

        while(null != p1 && null != p2){
            if(p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if(p1 != null)
            p.next = p1;
        if(p2 != null)
            p.next = p2;

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
