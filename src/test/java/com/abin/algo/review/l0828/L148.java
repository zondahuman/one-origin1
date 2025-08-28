package com.abin.algo.review.l0828;

import com.abin.algo.review.l0819.L25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 148. 排序链表
 * 这题的难度完全取决于要求的空间复杂度。要求O(n)就是简单题, O(logn)就是中等题, O(1)就是困难题
 */
public class L148 {
    /**
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if(null == head)
            return head;
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while(null != p){
            list.add(p.val);
            p = p.next;
        }
        Collections.sort(list);
        p = head;
        for (int i = 0; i <list.size() ; i++) {
            p.val = list.get(i);
            p = p.next;
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
