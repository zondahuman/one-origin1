package com.abin.lee.algo.leetcode.questions.array.one;
/**
 * 53. 最大子数组和
 * https://labuladong.online/algo/dynamic-programming/maximum-subarray/
 */
public class L53MaxSubArray {
    public int maxSubArray(int[] nums) {
        int preSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            preSum = Math.max(preSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, preSum);
        }
        return maxSum;
    }


    public int maxSubArrayPreSum(int[] nums) {
        int n = nums.length;
        if (0 == n)
            return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

    public int maxSubArraySlideWindow(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (right<n) {
            windowSum += nums[right];
            right++;

            maxSum = Math.max(maxSum, windowSum);
            while(windowSum < 0){
                windowSum-=nums[left];
                left++;
            }
        }
        return maxSum;
    }

}
