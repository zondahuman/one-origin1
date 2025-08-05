package com.abin.algo.review.l0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L128 {

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(min, num);
            set.add(num);
        }
        int count = 1;
        for (Iterator<Integer> iterator =set.iterator();iterator.hasNext();) {
            min+=1;
            while(set.contains(min))
                count++;
        }
        return count;
    }



}
