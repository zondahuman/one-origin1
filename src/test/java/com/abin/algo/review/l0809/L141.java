package com.abin.algo.review.l0809;

public class L141 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(null != fast && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(null == fast || null == fast.next)
            return null;
        slow = head;
        while(slow != fast){
            slow = slow.next ;
            fast = fast.next;
        }
        return slow;
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
