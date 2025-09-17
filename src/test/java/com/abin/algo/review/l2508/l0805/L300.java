package com.abin.algo.review.l2508.l0805;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 300. 最长递增子序列
 */
public class L300 {

    /**
     * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
     * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
     * 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
       int n = nums.length;
       int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i] , dp[j]+1);
                }
            }
        }
        int result = 0;
        for (int i = 0; i <dp.length ; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }



}
