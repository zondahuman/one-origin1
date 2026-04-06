package com.abin.algo.review.l26.l2604.l0406;

import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 *  // 小顶堆，堆顶是最小元素
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/description/
 */
public class L215 {
    /**
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     *  // 小顶堆，堆顶是最小元素
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
       return pq.peek();
    }


}
