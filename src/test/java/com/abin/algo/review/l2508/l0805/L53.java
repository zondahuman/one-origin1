package com.abin.algo.review.l2508.l0805;

public class L53 {


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
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



    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        int[] preSum = new int[n+1];
        preSum[0] = 0;
        for (int i = 1; i <=n ; i++) {
            preSum[i] = preSum[i-1]+nums[i-1];
        }
        int maxSum = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            minVal = Math.min(minVal, preSum[i]);
            maxSum = Math.max(maxSum, preSum[i+1]-minVal);
        }
        return maxSum;
    }


}
