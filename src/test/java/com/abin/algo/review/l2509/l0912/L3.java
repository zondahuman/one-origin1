package com.abin.algo.review.l2509.l0912;

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
        Map<Character, Integer> window = new HashMap<>();
        int left=0, right=0;
        int maxLen = 0;
        while(right<s.length()){
            char a = s.charAt(right);
            window.put(a, window.getOrDefault(a, 0)+1);
            right++;
            while(window.get(a)>1){
                char b = s.charAt(left);
                window.put(b, window.get(b)-1);
                left++;
            }
            maxLen = Math.max(maxLen, right-left);
        }
        return maxLen;
    }



}
