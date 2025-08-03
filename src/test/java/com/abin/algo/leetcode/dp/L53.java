package com.abin.algo.leetcode.dp;

public class L53 {
    public int maxSubArray(int[] nums) {
        int preSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            preSum = Math.max(preSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, preSum);
        }
        return maxSum;
    }


    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        if (0 == n)
            return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
