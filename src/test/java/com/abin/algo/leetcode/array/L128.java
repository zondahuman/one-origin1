package com.abin.algo.leetcode.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L128 {

    /**
     * 128. 最长连续序列
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * 可能里面包含好几部份数据，一部分一部分的去查找最长的，最后比较各个部分最长的，拿到结果
     * 示例 1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * 示例 2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     * 示例 3：
     * 输入：nums = [1,0,1,2]
     * 输出：3
     *
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums)
            hashSet.add(num);
        int result = Integer.MIN_VALUE;
        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext();){
            int num = iterator.next();
            //不是第一个，跳过
            if(hashSet.contains(num-1)){
                continue;
            }
            int curNum = num;
            int curLen = 1;
            while(hashSet.contains(curNum+1)){
                curNum+=1;
                curLen+=1;
            }
            result = Math.max(result, curLen);
        }
        return result;
    }





}

