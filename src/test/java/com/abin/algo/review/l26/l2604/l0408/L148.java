package com.abin.algo.review.l26.l2604.l0408;

import com.abin.algo.review.l26.l2604.l0407.L143;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 148. 排序链表
 * https://leetcode.cn/problems/sort-list/
 */
public class L148 {

    /**
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode listNode = head;
        while(null != listNode){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.sort(list);
        listNode = head;
        for (int i = 0; i <list.size() ; i++) {
            listNode.val = list.get(i);
            listNode = listNode.next;
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
