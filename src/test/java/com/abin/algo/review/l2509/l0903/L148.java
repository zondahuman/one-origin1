package com.abin.algo.review.l2509.l0903;

import com.abin.lee.algo.leetcode.questions.list.L148SortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 148. 排序链表
 */
public class L148 {

    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head ;
        while(null != cur){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        cur = head;
        for (int i = 0; i <list.size() ; i++) {
            cur.val = list.get(i);
            cur = cur.next;
        }
        return head;
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
