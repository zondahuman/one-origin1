package com.abin.algo.review.l26.l2604.l0407;

/**
 * 86. 分隔链表
 * https://leetcode.cn/problems/partition-list/
 */
public class L86 {
    /**
     * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
     * 你应当 保留 两个分区中每个节点的初始相对位置。
     *
     * 示例 1：
     * 输入：head = [1,4,3,2,5,2], x = 3
     * 输出：[1,2,2,4,3,5]
     *
     * 示例 2：
     * 输入：head = [2,1], x = 2
     * 输出：[1,2]
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if(null == head) return null;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1, p2 = dummy2;
        ListNode p = head;
        while(null != p){
            if(p.val < x){
                p1.next = p;
                p1 = p1.next;
            }else{
                p2.next = p;
                p2 = p2.next;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        p1.next = dummy2.next;
        return dummy1.next;
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
