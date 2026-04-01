package com.abin.algo.review.l2603.l0331;

import java.util.Stack;

/**
 * 143. 重排链表
 * https://leetcode.cn/problems/reorder-list/description/
 */
public class L143 {
    /**
     * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
     * L0 → L1 → … → Ln - 1 → Ln
     * 请将其重新排列后变为：
     * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
     * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * 输入：head = [1,2,3,4]
     * 输出：[1,4,2,3]
     *
     * 输入：head = [1,2,3,4,5]
     * 输出：[1,5,2,4,3]
     * @param head
     */
    public void reorderList(ListNode head) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while(null != node){
            stack.push(node);
            node = node.next;
        }
        node = head;
        while(null != node){
            ListNode next = node.next ;
            ListNode lastNode = stack.pop();
            if(lastNode==next || lastNode.next==next){
                lastNode.next = null;
                break;
            }
            node.next = lastNode;
            lastNode.next = next;
            node = next;
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
