package com.abin.algo.review.l26.l2603.l0321;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. 只出现一次的数字
 * https://leetcode.cn/problems/single-number/description/
 */
public class L136 {
    /**
     * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums)
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        for (int i = 0; i <nums.length ; i++) {
            Integer times = hashMap.get(nums[i]);
            if(null != times && times == 1){
                return nums[i];
            }
        }
        return -1;
    }





}
