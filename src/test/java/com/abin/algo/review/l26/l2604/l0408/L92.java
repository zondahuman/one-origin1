package com.abin.algo.review.l26.l2604.l0408;

/**
 * 92. 反转链表 II
 * https://leetcode.cn/problems/reverse-linked-list-ii/description/
 */
public class L92 {

    /**
     * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
     *
     * 示例 1：
     * 输入：head = [1,2,3,4,5], left = 2, right = 4
     * 输出：[1,4,3,2,5]
     *
     * 示例 2：
     * 输入：head = [5], left = 1, right = 1
     * 输出：[5]
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i <left-1 ; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for(int i=0;i<right-left;i++){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
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
