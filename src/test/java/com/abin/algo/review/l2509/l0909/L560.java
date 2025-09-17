package com.abin.algo.review.l2509.l0909;

/**
 * 560. 和为 K 的子数组
 */
public class L560 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
     * 子数组是数组中元素的连续非空序列。
     * @param nums
     * @param k
     * @return
     *
     * 没写对，不能用滑动窗口
     */
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int left=0, right=0;
        int sum = 0;
        int count = 0;
        while(right<n){
            sum += nums[right];
            right++;
            count++;
            while(sum != k){
                sum-=nums[left];
                left++;
                count--;
            }
        }
        return count;
    }


}
