package com.abin.algo.review.l2509.l0909;

/**
 * 152. 乘积最大子数组
 */
public class L152 {
    /**
     * 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续 子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
     * 测试用例的答案是一个 32-位 整数。
     * @param nums
     * @return
     */
    public int maxProductDp(int[] nums) {
        int n = nums.length;
        //最小乘积
        int[] dp1 = new int[n];
        //最大乘积
        int[] dp2 = new int[n];
        dp1[0] = nums[0];
        dp2[0] = nums[0];
        for (int i = 1; i <n ; i++) {
            dp1[i] = Math.min(Math.min(dp1[i-1]*nums[i], dp2[i-1]*nums[i]), nums[i]);
            dp2[i] = Math.max(Math.max(dp1[i-1]*nums[i], dp2[i-1]*nums[i]), nums[i]);
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <dp2.length ; i++) {
            result = Math.max(result, dp2[i]);
        }
        return result;
    }


    /**
     * 这个滑动窗口有问题，跑不通
     * @param nums
     * @return
     */
    public int maxProductWindow(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int windowTimes = 1;
        int maxTimes = Integer.MIN_VALUE;
        while (right < n) {
            windowTimes *= nums[right];
            right++;
            maxTimes = windowTimes == 0 ? 0 : Math.max(maxTimes, windowTimes);
            while (windowTimes < Integer.MIN_VALUE) {
                windowTimes /= nums[left];
                left++;
            }
        }
        return maxTimes;
    }

}
