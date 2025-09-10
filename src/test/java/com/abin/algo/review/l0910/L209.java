package com.abin.algo.review.l0910;

public class L209 {

    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其总和大于等于 target 的长度最小的 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int windowSum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right<n){
            windowSum += nums[right];
            right++;
            while(left<right && windowSum>=target){
                minLen = Math.min(minLen, right-left);
                windowSum-=nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }



}
