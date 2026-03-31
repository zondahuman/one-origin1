package com.abin.algo.review.l2603.l0331;

import com.abin.lee.algo.util.JsonUtil;
import org.junit.Test;

/**
 * 61. 旋转链表
 * https://leetcode.cn/problems/rotate-list/description/
 */
public class L61 {

    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null)
            return head;
        int n=1;
        ListNode dummy = head;
        while(dummy.next != null){
            dummy = dummy.next;
            n++;
        }
        int add = n-k%n;
        if(add == n){
            return head;
        }
        dummy.next = head;
        while(add-->0){
            dummy = dummy.next;
        }
        ListNode result = dummy.next;
        dummy.next = null;
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

    /**
     * 输入：head = [1,2,3,4,5], k = 2
     * 输出：[4,5,1,2,3]
     * @param args
     */
    public static void main(String[] args) {
        
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        ListNode l15 = new ListNode(5);
        ListNode l16 = new ListNode(6);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;

//        ListNode listNode = reverseBetween(l1);
        ListNode listNode = rotateRight(l1, 2);
        System.out.println("listNode=" + JsonUtil.toJson(listNode));

        ListNode l2 = new ListNode(0);
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(2);

        l2.next = l21;
        l21.next = l22;
        ListNode listNode2 = rotateRight(l1, 4);
    }


}
