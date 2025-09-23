package com.abin.algo.review.l2509.l0922;

import java.util.HashSet;

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
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer num:nums){
            hashSet.add(num);
        }
        int maxLen = 0;
        for (int num:hashSet) {
            if(hashSet.contains(num-1)){
                continue;
            }
            int curNum = num;
            int curLen = 1;
            while(hashSet.contains(curNum+1)){
                curNum+=1;
                curLen+=1;
            }
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;
    }


}
