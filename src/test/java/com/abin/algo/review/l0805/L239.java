package com.abin.algo.review.l0805;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 239. 滑动窗口最大值
 * 困难
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
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i <k ; i++) {
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] result = new int[n-k+1];
        result[0] = nums[deque.peekFirst()];
        int max = Integer.MIN_VALUE;
        for (int i = k; i <n ; i++) {
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            //检查队首索引是否在窗口内：如果队首索引小于等于i-k（即不在当前窗口内），则将其从队首移除。
            while(deque.peekFirst() <= n-k){
                deque.pollFirst();
            }
            result[n-k+1] = nums[deque.peekFirst()];
        }
        return result;
    }

}
