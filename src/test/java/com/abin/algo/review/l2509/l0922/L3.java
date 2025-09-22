package com.abin.algo.review.l2509.l0922;

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
        Map<Character, Integer> params = new HashMap<>();
        int left =0, right=0;
        int result = Integer.MIN_VALUE;
        while(right<s.length()){
            char c = s.charAt(right);
            params.put(c, params.getOrDefault(c, 0)+1) ;
            right++;
            while(params.get(c)>1){
                char d= s.charAt(left);
                params.put(d, params.get(d)-1);
                left++;
            }
            result = Math.max(result, right-left);
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }



}
