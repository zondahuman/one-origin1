package com.abin.algo.leetcode.array;

/**
 *713. 乘积小于 K 的子数组
 */
public class L713 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
     * 示例 1：
     *
     * 输入：nums = [10,5,2,6], k = 100
     * 输出：8
     * 解释：8 个乘积小于 100 的子数组分别为：[10]、[5]、[2]、[6]、[10,5]、[5,2]、[2,6]、[5,2,6]。
     * 需要注意的是 [10,5,2] 并不是乘积小于 100 的子数组。
     * 示例 2：
     *
     * 输入：nums = [1,2,3], k = 0
     * 输出：0
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int count = 0;
        int window = 1;
        while(right < n){
            window = window * nums[right];
            right++;
            while(left < right && window >= k){
                window = window / nums[left] ;
                left++;
            }
            count += right - left;
        }
        return count;
    }


}
