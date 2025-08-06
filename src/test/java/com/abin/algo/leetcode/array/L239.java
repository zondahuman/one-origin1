package com.abin.algo.leetcode.array;

import com.abin.lee.algo.util.JsonUtil;
import org.junit.Test;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i <k ; i++) {
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] result = new int[n-k+1];
        result[0] = nums[deque.peekFirst()];
        for (int i = k; i <n ; i++) {
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            //检查队首索引是否在窗口内：如果队首索引小于等于i-k（即不在当前窗口内），则将其从队首移除。
            while(deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            result[i-k+1] = nums[deque.peekFirst()];
        }
         return result;
    }


    public int[] maxSlidingWindowOffical(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

    @Test
    public void test1(){
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3 ;
//        int[] result = maxSlidingWindow(nums, k);
        int[] result = maxSlidingWindowOffical(nums, k);
        System.out.println("result="+ JsonUtil.toJson(result));
    }

}
