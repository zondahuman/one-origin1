package com.abin.algo.review.l2603.l0326;

/**
 * 152. 乘积最大子数组
 * https://leetcode.cn/problems/maximum-product-subarray/description/
 */
public class L152 {
    /**
     * 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续 子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
     * 测试用例的答案是一个 32-位 整数。
     * 请注意，一个只包含一个元素的数组的乘积是这个元素的值。
     *
     * 示例 1:
     * 输入: nums = [2,3,-2,4]
     * 输出: 6
     * 解释: 子数组 [2,3] 有最大乘积 6。
     * 示例 2:
     *
     * 输入: nums = [-2,0,-1]
     * 输出: 0
     * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
     *
     * 维护两个数组，处理和为负数，下一个数也为负数的情况，这个时候乘积就变成了正数。
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dps = new int[n];
        int[] dpb = new int[n];
        dps[0] = nums[0];
        dpb[0] = nums[0];
        for (int i = 1; i <n ; i++) {
            dps[i] = Math.min(Math.min(dps[i-1]*nums[i], dpb[i-1]*nums[i]), nums[i]);
            dpb[i] = Math.max(Math.max(dps[i-1]*nums[i], dpb[i-1]*nums[i]), nums[i]);
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <dpb.length ; i++) {
            result = Math.max(result, dpb[i]);
        }
        return result;
    }


}
