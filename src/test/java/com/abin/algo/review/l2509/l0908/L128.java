package com.abin.algo.review.l2509.l0908;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 128. 最长连续序列
 */
public class L128 {

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            sets.add(nums[i]);
        }
        int result = 0;
        for(Integer num:sets){
            if(sets.contains(num-1)){
                continue;
            }
            int curNum=num;
            int curLen = 1;
            while(sets.contains(curNum+1)){
                curNum++;
                curLen++;
            }
            result = Math.max(curLen, result);
        }
        return result;
    }



}
