package com.abin.algo.review.l2509.l0918;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * 239. 滑动窗口最大值
 */
public class L239 {
    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
     * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回 滑动窗口中的最大值 。
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i <k ; i++) {
            while(!queue.isEmpty() && nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        int[] result =new int[nums.length-k+1];
        result[0] = nums[queue.peekFirst()];
        for (int i = k; i <nums.length ; i++) {
            while(!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            while(queue.peekFirst()<=i-k){
                queue.pollFirst();
            }
            result[i-k+1] = nums[queue.peekFirst()];
        }
        return result;
    }



}
