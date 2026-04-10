package com.abin.algo.review.l26.l2604.l0410;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. 最长连续序列
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/
 */
public class L128 {

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int maxLen = 0;
        for(int num:hashSet){
            if(hashSet.contains(num-1)){
                continue;
            }
            int len = 1;
            int cur = num;
            while(hashSet.contains(cur+1)){
                cur+=1;
                len+=1;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

}
