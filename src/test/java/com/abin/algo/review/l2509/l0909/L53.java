package com.abin.algo.review.l2509.l0909;

/**
 * 53. 最大子数组和
 */
public class L53 {
    /**
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 子数组是数组中的一个连续部分。
     * @param nums
     * @return
     */
    public int maxSubArrayDp(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i <n ; i++) {
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <dp.length ; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }



    public int maxSubArrayWindow(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(right<n){
            windowSum+=nums[right];
            right++;
            maxSum = Math.max(maxSum, windowSum);
            while(windowSum<0){
                windowSum-=nums[left];
                left++;
            }
        }
        return maxSum;
    }

}
