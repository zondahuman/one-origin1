package com.abin.algo.review.l2509.l0905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 148. 排序链表
 */
public class L148 {

    /**
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if(null == head) return null;
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while(null != node){
            list.add(node.val);
            node = node.next ;
        }
        Collections.sort(list);
        node = head;
        for (int i = 0; i <list.size() ; i++) {
            node.val = list.get(i);
            node = node.next;
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
