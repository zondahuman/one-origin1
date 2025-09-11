package com.abin.algo.review.l0910;

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
        Map<Character, Integer> need = new HashMap<>();
        int left=0, right=0;
        int curLen = 0;
        int maxLen = 0;
        while(right<n){
            char a = s.charAt(right);
            need.put(a, need.getOrDefault(a, 0)+1);
            right++;
            while(need.get(a)>1){
                char d = s.charAt(left);
                left++;
                need.put(d, need.get(d)-1);
            }
            maxLen = Math.max(maxLen, right-left);
        }
        return maxLen;
    }

}
