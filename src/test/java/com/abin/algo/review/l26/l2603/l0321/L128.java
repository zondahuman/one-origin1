package com.abin.algo.review.l26.l2603.l0321;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 128. 最长连续序列
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/
 */
public class L128 {
    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * 示例 1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     *
     * 示例 2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     *
     * 示例 3：
     * 输入：nums = [1,0,1,2]
     * 输出：3
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (Integer set:nums) {
            hashSet.add(set);
        }
        int maxLen = Integer.MIN_VALUE;
        for (int num:hashSet) {
            if(hashSet.contains(num-1)){
                continue;
            }
            int curNum = num;
            int curLen = 1;
            while(hashSet.contains(curNum+1)){
                curNum++;
                curLen++;
            }
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }



}
