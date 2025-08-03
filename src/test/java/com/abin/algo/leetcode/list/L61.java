package com.abin.algo.leetcode.list;

import org.junit.Test;

/**
 * 61. 旋转链表
 * 官方这个连成环的方式太难想了，我选择的是三步走：
 * 全反转
 * 前k反转
 * 后n-k反转
 * 官方的更好想一点，总结出来就是一句话，把后k个结点截下来连到表头而已。
 *  注意：这里移动add步实际上是找到新链表的尾节点。因为向右移动k次，相当于将链表的最后k个节点移动到前面。
 *        而新链表的尾节点就是原链表的第n-k个节点（从1开始计数）。当k可能大于n时，我们取模，所以实际移动步数为add = n - k%n。
 *
 * k % n：取模，避免 k > n 时的无效旋转（比如 k=10, n=5，实际只需旋转 0 次）
 * add = n - k%n：表示从原头节点出发，需要走 add 步才能到达 新的尾节点
 * iter.next = head;
 * 成环：让原尾节点指向原头节点，形成一个环形链表
 */
public class L61 {

    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * 核心思路：将链表首尾相连形成环，再在合适位置断开
     * 先遍历链表，得到长度 n
     * 计算有效旋转次数：k % n，避免重复循环
     * 找到新尾节点的位置：n - k%n，这个节点之后就是新的头节点
     * 成环：让原尾节点指向原头节点
     * 移动指针到断开位置，断开环，返回新头
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null){
            return head;
        }
        int n = 1;
        ListNode listNode = head;
        while(null != listNode.next){
            listNode = listNode.next;
            n++;
        }
        int add = n -k % n;
        if(add == n)
            return head;
        listNode.next = head;
        while(add-- > 0){
            listNode = listNode.next;
        }
        ListNode result = listNode.next;
        listNode.next = null;
        return result;
    }





    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    @Test
    public void test1(){
        System.out.println(2%5);
    }

}
