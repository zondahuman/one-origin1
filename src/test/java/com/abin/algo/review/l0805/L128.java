package com.abin.algo.review.l0805;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L128 {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int result = Integer.MIN_VALUE;
        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext(); ) {
            int num = iterator.next();
            if (hashSet.contains(num - 1)) {
                continue;
            }
            int curLen = 1;
            int curNum = num;
            while (hashSet.contains(curNum + 1)) {
                curLen++;
                curNum++;
            }
            result = Math.max(result, curLen);
        }
        return result;
    }


}
