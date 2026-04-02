package com.abin.algo.review.l26.l2603.l0326;

/**
 * 53. 最大子数组和
 * https://leetcode.cn/problems/maximum-subarray/description/
 */
public class L53 {
    /**
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 子数组是数组中的一个连续部分。
     *
     * 示例 1：
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     *
     * 示例 2：
     * 输入：nums = [1]
     * 输出：1
     * 示例 3：
     *
     * 输入：nums = [5,4,-1,7,8]
     * 输出：23
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int windowSum =0, maxSum = Integer.MIN_VALUE;
        int left=0,right=0;
        while(right<nums.length){
            windowSum+=nums[right];
            right++;
            maxSum = Math.max(windowSum, maxSum);
            while(windowSum<0){
                windowSum-=nums[left];
                left++;
            }
        }
        return maxSum;
    }


}
