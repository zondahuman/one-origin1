package com.abin.algo.review.l26.l2603.l0322;

import java.util.HashMap;
import java.util.Map;

/**
 * 137. 只出现一次的数字 II
 * https://leetcode.cn/problems/single-number-ii/
 */
public class L137 {

    /**
     * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
     * 你必须设计并实现线性时间复杂度的算法且使用常数级空间来解决此问题。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums)
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        for(int num:nums){
            int result = hashMap.get(num);
            if(1 == result)
                return num;
        }
        return Integer.MIN_VALUE;
    }


}
