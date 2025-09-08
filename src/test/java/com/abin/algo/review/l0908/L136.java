package com.abin.algo.review.l0908;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. 只出现一次的数字
 */
public class L136 {

    /**
     * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> params = new HashMap<>();
        for(Integer num:nums){
            params.put(num, params.getOrDefault(num, 0)+1) ;
        }
        for(Map.Entry<Integer, Integer> entry:params.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }


}
