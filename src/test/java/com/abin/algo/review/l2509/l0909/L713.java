package com.abin.algo.review.l2509.l0909;

/**
 * 713. 乘积小于 K 的子数组
 */
public class L713 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left=0, right =0;
        int windowProduct = 1;
        int windowCount =0;
        while(right<n){
            windowProduct *= nums[right];
            right++;
            while(left<right && windowProduct>=k){
                windowProduct /= nums[left];
                left++;
            }
            windowCount += right - left;
        }
        return windowCount;
    }





}
