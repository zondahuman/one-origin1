package com.abin.algo.review.l0805;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class L136 {


    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
            }else{
                hashMap.put(nums[i], 1);
            }
        }
        for(Iterator<Map.Entry<Integer,Integer>> iterator =hashMap.entrySet().iterator();iterator.hasNext();){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue().equals(1))
                return entry.getKey();
        }
        return -1;
    }




}
