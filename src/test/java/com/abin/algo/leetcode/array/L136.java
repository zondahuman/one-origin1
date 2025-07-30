package com.abin.algo.leetcode.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class L136 {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num:nums) {
            if(hashMap.containsKey(num))
                hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
            else
                hashMap.put(num, 1);
        }
        for(Iterator<Map.Entry<Integer, Integer>> iterator=hashMap.entrySet().iterator();iterator.hasNext();){
            Map.Entry<Integer, Integer> temp = iterator.next();
            if(temp.getValue() == 1)
                return temp.getKey();
        }
        return -1;
    }

}
