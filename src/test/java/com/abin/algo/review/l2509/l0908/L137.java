package com.abin.algo.review.l2509.l0908;

import java.util.HashMap;
import java.util.Map;

/**
 * 137. 只出现一次的数字 II
 */
public class L137 {

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
