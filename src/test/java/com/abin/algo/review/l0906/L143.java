package com.abin.algo.review.l0906;

import java.util.*;

/**
 * 143. 重排链表
 */
public class L143 {

    /**
     * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
     * L0 → L1 → … → Ln - 1 → Ln
     * 请将其重新排列后变为：
     * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
     * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     * @param head
     */
    public void reorderList(ListNode head) {
        if(null == head) return;
        Stack<ListNode> stack = new Stack<>();
        ListNode listNode = head;
        while(null != listNode){
            stack.add(listNode);
            listNode = listNode.next;
        }
        listNode = head;
        while(!stack.isEmpty()){
            ListNode lastNode = stack.pop();
            ListNode next = listNode.next;
            if(lastNode.next == next || lastNode == next){
                lastNode.next = null;
                break;
            }
            listNode.next = lastNode;
            lastNode.next = next;
            listNode = next;
        }
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
