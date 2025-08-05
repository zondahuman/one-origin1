package com.abin.algo.leetcode.list;

/**
 * 25. K 个一组翻转链表
 */
public class L25 {
    /**
     * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
     * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
     * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
     * 输入：head = [1,2,3,4,5], k = 2
     * 输出：[2,1,4,3,5]
     * 输入：head = [1,2,3,4,5], k = 3
     * 输出：[3,2,1,4,5]
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if(null == head)
            return null;
        // 区间 [a, b) 包含 k 个待反转元素
        ListNode a = head, b = head;
        for (int i = 0; i <k ; i++) {
            if( b == null) return head;
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    ListNode reverse(ListNode a, ListNode b){
        ListNode pre,cur,nxt;
        pre = null;
        cur = a;
        nxt = a;
        while(cur != b){
            nxt = cur.next;
            cur.next = pre ;
            pre = cur ;
            cur = nxt;
        }
        return pre;
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
