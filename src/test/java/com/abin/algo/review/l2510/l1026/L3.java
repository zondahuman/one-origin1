package com.abin.algo.review.l2510.l1026;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 */
public class L3 {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0,right=0;
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        while(right<n){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);
            right++;
            while(map.get(c)>1){
                char d = s.charAt(left);
                map.put(d, map.getOrDefault(d,0)-1);
                left++;
            }
            result = Math.max(result, right-left);
        }
        return result;
    }



}
