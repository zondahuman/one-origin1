package com.abin.algo.review.l0910;

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
        int left=0,right=0;
        int windowTimes = 1;
        int maxSum = 0;
        while(right<n){
            windowTimes *= nums[right];
            right++;
            while(left<right && windowTimes>=k){
                windowTimes /= nums[left];
                left++;
            }
            maxSum += right-left;
        }
        return maxSum;
    }

}
